package com.xiaoyv.account.listener;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public interface OnUserDataListener {
    void onError(String error);
    void onSuccess();
}
