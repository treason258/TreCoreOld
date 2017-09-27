package com.mjiayou.trecorelib.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mjiayou.trecorelib.R;
import com.mjiayou.trecorelib.bean.entity.TCMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by treason on 16/7/24.
 */
public class MenuUtil {

    private static final String TAG = MenuUtil.class.getSimpleName();

    /**
     * setMenu
     */
    public static void setMenus(Context context, ViewGroup container, List<TCMenu> tcMenus) {
        if (container == null) {
            LogUtils.w(TAG, "container == null");
            return;
        }
        if (tcMenus == null) {
            LogUtils.w(TAG, "tcMenus == null");
            return;
        }

        // 移除
        container.removeAllViews();
        // 添加
        for (TCMenu tcMenu : tcMenus) {
            if (tcMenu.getType() == TCMenu.TYPE_NORMAL) {
                View viewMenu = LayoutInflater.from(context).inflate(R.layout.tc_layout_menu_item_center, container, false);

                TextView tvMenu = (TextView) viewMenu.findViewById(R.id.tv_menu);
                tvMenu.setVisibility(View.VISIBLE);
                tvMenu.setText(tcMenu.getText());

                viewMenu.setVisibility(View.VISIBLE);
                viewMenu.setOnClickListener(tcMenu.getOnClickListener());

                container.setVisibility(View.VISIBLE);
                container.addView(viewMenu);
            }
        }
    }

    /**
     * setInfo
     */
    public static void setInfo(TextView textView, String info) {
        if (textView == null) {
            LogUtils.w(TAG, "textView == null");
            return;
        }
        if (info == null) {
            LogUtils.w(TAG, "info == null");
            return;
        }

        textView.setText(info);
    }

    /**
     * getTCMenus
     */
    public static List<TCMenu> getTCMenus(final Context context) {
        List<TCMenu> tcMenus = new ArrayList<>();
        tcMenus.add(new TCMenu("菜单1", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单1");
            }
        }));
        tcMenus.add(new TCMenu("菜单2", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单2");
            }
        }));
        tcMenus.add(new TCMenu("菜单3", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单3");
            }
        }));
        tcMenus.add(new TCMenu("菜单4", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单4");
            }
        }));
        tcMenus.add(new TCMenu("菜单5", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单5");
            }
        }));
        tcMenus.add(new TCMenu("菜单6", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单6");
            }
        }));
        tcMenus.add(new TCMenu("菜单7", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单7");
            }
        }));
        tcMenus.add(new TCMenu("菜单8", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单8");
            }
        }));
        tcMenus.add(new TCMenu("菜单9", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单9");
            }
        }));
        tcMenus.add(new TCMenu("菜单10", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单10");
            }
        }));
        tcMenus.add(new TCMenu("菜单11", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单11");
            }
        }));
        tcMenus.add(new TCMenu("菜单12", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单12");
            }
        }));
        tcMenus.add(new TCMenu("菜单13", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单13");
            }
        }));
        tcMenus.add(new TCMenu("菜单14", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单14");
            }
        }));
        tcMenus.add(new TCMenu("菜单15", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("菜单15");
            }
        }));
        tcMenus.add(new TCMenu(TCMenu.TYPE_CANCEL, "取消", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.show("取消");
            }
        }));
        return tcMenus;
    }
}
