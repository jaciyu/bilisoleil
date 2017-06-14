package com.yoyiyi.soleil.mvp.contract.app.live;


import com.yoyiyi.soleil.base.BaseContract;
import com.yoyiyi.soleil.bean.app.VideoDetailComment;

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * @date 创建时间：2017/5/23 9:45
 * 描述:欢迎界面Contract
 */

public interface CommentContract {
    interface View extends BaseContract.BaseView {
        void showComment(VideoDetailComment.DataBean videoDetailComment);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {

        void getCommentData();


    }
}
