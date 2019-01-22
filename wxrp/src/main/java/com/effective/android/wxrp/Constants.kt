package com.effective.android.wxrp

import android.content.Context

open class Constants internal constructor() {

    companion object {

        /**
         * 包名
         */
        val PACKAGE_SELF_APPLICATION = "com.effective.android.wxrp"           // 本程序包名
        val PACKAFEGE_WECHAT = "com.tencent.mm"                               // 微信包名
        val WECHAT = "微信"                                                   // 微信


        /**
         * 类名
         */
        val CLASS_NOTIFICATION = "services.WXNotificationService"            // 通知监听类名
        val CLASS_ACCESSBILITY = "services.WXAccessibilityService"           // 辅助服务类名
        val CLASS_LAUNCHER = "com.tencent.mm.ui.LauncherUI"         // 微信 聊天列表、聊天窗口（单聊私聊都是）
        var CLASS_PACKET_RECEIVE = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI"           // 微信 红包“開”的窗口
        val CLASS_PACKET_SEND = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI"               // 微信 自己发红包的窗口
        val CLASS_PACKET_PAY = "com.tencent.mm.plugin.wallet_core.ui.l"                                 // 微信 自己发红包输入密码的界面
        val CLASS_PACKET_DETAIL = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI"              // 微信 红包详情


        /**
         * 红包界面 id
         */
        val ID_WID_CHAT_PACKET_DIALOG_BUTTON = "com.tencent.mm:id/cv0"       // 聊天页面 - 红包对话框 - 开

        /**
         * 红包详情页 id
         */
        val ID_PACKET_DETAIL_POST_USER_NAME = "com.tencent.mm:id/cqr"       // 红包详情页 - 发送者昵称
        val ID_PACKET_DETAIL_PACKET_NUM = "com.tencent.mm:id/cqv"           // 红包详情页 - 红包金额


        /**
         * 聊天页面 id
         */
        val ID_WID_CHAT_DIALOG_ITEM = "com.tencent.mm:id/a9"                //聊天界面 - 聊天列表 - 对话item
        val ID_WID_CHAT_DIALOG_AVATAR = "com.tencent.mm:id/nj"              // 聊天页面 - 聊天列表 - 红包item - 头像
        val ID_WID_CHAT_DIALOG_PACKET = "com.tencent.mm:id/ao4"             // 聊天页面 - 聊天列表 - 红包item - 包括下面
        val ID_WID_CHAT_DIALOG_PACKET_MESSAGE = "com.tencent.mm:id/apd"     // 聊天页面 - 聊天列表 - 红包item - 祝福语比如说恭喜发财
        val ID_WID_CHAT_DIALOG_PACKET_TIP = "com.tencent.mm:id/ape"         // 聊天页面 - 聊天列表 - 红包item - 红包状态比如说领取之后显示已领取
        val ID_WID_CHAT_DIALOG_PAGE_TITLE = "com.tencent.mm:id/jw"          // 聊天页面 - 聊天列表 - 个人聊天则是昵称，群聊天则是群昵称

        /**
         * 首页-微信tab 聊天会话 id
         */
        val ID_WID_CHAT_LIST_ITEM = "com.tencent.mm:id/b4m"                     // 首页列表 - 聊天会话 - item id
        val ID_WID_CHAT_LIST_MESSAGE_TEXT = "com.tencent.mm:id/b4q"            // 微信列表 每一个item中的文本id
        val ID_WID_CHAT_LIST_TITLE_TEXT = "com.tencent.mm:id/b4o"            // 微信列表 每一个item中的会话名字

        /**
         * 首页-我tab
         */
        val ID_USER_NICK = "com.tencent.mm:id/a5b"                  // 我的页面，微信昵称
        val ID_USER_WEIXINHAO = "com.tencent.mm:id/d7y"            // 我的页面，微信号

        val ID_HOME_TITLE = "android:id/text1"              // 首页4个tab的标题，存在与微信tab，通讯录tab，发现tab，用于过滤没有必要的轮训


        /**
         * 校验文本
         */
        val TEXT_WX_PACKET = "[微信红包]"
        val TEXT_TAB_TITLE_WEIXIN= "微信"
        val TEXT_TAB_TITLE_CHATLIST= "通讯录"
        val TEXT_TAB_TITLE_DISC = "发现"


        /**
         * 流程状态
         */
        var W_otherStatus = 0
        var W_openedPacketSendStatus = 1            //打开红包发送界面
        var W_openedPayStatus = 2                   //打开支付界面
        var W_intoChatDialogStatus = 3              //聊天对话框状态
        var W_gotSelfPacketStatus = 4               //获取自己的红包 （在聊天详情页中点击自己发送的红包）
        var currentSelfPacketStatus = W_otherStatus

        fun setCurrentSelfPacketStatusData(status: Int) {
            currentSelfPacketStatus = status
        }


        var isPreviouslyLockScreen = false          //是否已经锁屏
        var isGotNotification = false               //是否获取锁屏信息
        var isClickedNewMessageList = false         //是否点击新消息列表
        var isGotPacket = false                     //是否获取到红包，打开之后为false
    }
}