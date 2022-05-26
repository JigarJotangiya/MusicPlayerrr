package com.coocent.video.videoplayercore.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videostore.p067po.Video;
import p369i.p387z.p389d.C8594l;

/* compiled from: NotificationReceiver.kt */
public final class NotificationReceiver extends BroadcastReceiver {
    private String TAG = "NotificationReceiver";

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            AudioPlayService.Companion companion = AudioPlayService.Companion;
            if (C8594l.m46767a(action, companion.getNOTIFICATION_RESUME())) {
                AudioPlayService instance = companion.getInstance();
                if (instance != null) {
                    instance.onPauseOrResume(false);
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_PAUSE())) {
                AudioPlayService instance2 = companion.getInstance();
                if (instance2 != null) {
                    instance2.onPauseOrResume(true);
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_NEXT())) {
                AudioPlayService instance3 = companion.getInstance();
                if (instance3 != null) {
                    instance3.onAudioPlayNext();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_PREV())) {
                AudioPlayService instance4 = companion.getInstance();
                if (instance4 != null) {
                    instance4.onAudioPlayPrevious();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_EXIT())) {
                AudioPlayService instance5 = companion.getInstance();
                if (instance5 != null) {
                    instance5.onAudioPlayExit();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_CLICK())) {
                AudioPlayService instance6 = companion.getInstance();
                if (instance6 != null) {
                    instance6.onClickNotification();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_UPDATE_STATUS())) {
                AudioPlayService instance7 = companion.getInstance();
                if (instance7 != null) {
                    instance7.onAudioPlay();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_CLICK_PLAY())) {
                AudioPlayService instance8 = companion.getInstance();
                if (instance8 != null) {
                    instance8.onClickPlay();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_RELEASE())) {
                AudioPlayService instance9 = companion.getInstance();
                if (instance9 != null) {
                    instance9.onAudioRelease();
                }
            } else if (C8594l.m46767a(action, companion.getNOTIFICATION_RENAME())) {
                String stringExtra = intent.getStringExtra(AudioPlayService.KEY_RENAME);
                Video video = (Video) intent.getParcelableExtra(AudioPlayService.KEY_RENAME_VIDEO);
                AudioPlayService instance10 = companion.getInstance();
                if (instance10 != null) {
                    instance10.onAudioReTitle(video, stringExtra);
                }
            }
        }
    }
}
