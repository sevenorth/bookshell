package com.monke.monkeybook.presenter.contract;

import android.net.Uri;
import android.support.design.widget.Snackbar;

import com.monke.basemvplib.impl.IPresenter;
import com.monke.basemvplib.impl.IView;
import com.monke.monkeybook.bean.ReplaceRuleBean;

import java.util.List;

public interface ReplaceRuleContract {
    interface Presenter extends IPresenter {

        void saveData(List<ReplaceRuleBean> replaceRuleBeans);

        void delData(ReplaceRuleBean replaceRuleBean);

        void delData(List<ReplaceRuleBean> replaceRuleBeans);

        void importDataS(Uri uri);

        void importDataS(String url);
    }

    interface View extends IView {

        void refresh();

        Snackbar getSnackBar(String msg, int length);

        void showSnackBar(String msg, int length);
    }

}
