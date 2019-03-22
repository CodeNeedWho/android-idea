package com.jsdroid.idea;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.Window;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.jsdroid.editor.activity.EditActivity;
import com.jsdroid.editor.parser.Colors;

import java.io.File;

public class MainActivity extends EditActivity {

    private static final int REQUEST_SDCARD_PERMISSION = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        Colors.init(this);
        requestSdcardPermission();
    }

    public void requestSdcardPermission() {
        //检查读写权限和悬浮窗权限
        int sd = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (sd == PackageManager.PERMISSION_GRANTED) {
            //打开项目
            openProject();
        } else {
            //请求权限
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_SDCARD_PERMISSION);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQUEST_SDCARD_PERMISSION: {
                //这个0是requestCode，上面requestPermissions有用到
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //打开项目
                    openProject();
                } else {
                    Toast.makeText(this, "同意读写文件权限后才能编写代码。", Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            requestSdcardPermission();
                        }
                    }, 2000);

                }
                break;
            }
        }
    }

    @Override
    protected void openProject() {
        mFileView.setRootFile(new File("/sdcard/idea"));
        mDrawerLayout.openDrawer(Gravity.LEFT);
    }

    @Override
    protected void eye() {
        Toast.makeText(this, "暂时不支持预览~", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void run() {
        Toast.makeText(this, "暂时不支持运行~", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void showMenu() {
        PopupMenu popupMenu = new PopupMenu(this, mImgBtnMenu);
        popupMenu.getMenu().add("关于");
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = item.getTitle().toString();
                if ("关于".equals(title)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this).setTitle("IDEA V1.1").setMessage("目前支持：c、c++、java、c#、javascript、lua、python、go、groovy、html、sql、json语法高亮。\n\n邮箱：980008027@qq.com");
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
