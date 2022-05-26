package coocent.music.player.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.un4seen.bass.BASS;
import coocent.music.player.activity.MainActivity;

public class MediaButtonIntentReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f31278a = false;

    /* renamed from: b */
    private static Handler f31279b = new C7061a();

    /* renamed from: coocent.music.player.service.MediaButtonIntentReceiver$a */
    class C7061a extends Handler {
        C7061a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && !MediaButtonIntentReceiver.f31278a) {
                Context context = (Context) message.obj;
                Intent intent = new Intent();
                intent.setClass(context, MainActivity.class);
                intent.setFlags(BASS.BASS_SPEAKER_REAR2LEFT);
                context.startActivity(intent);
                boolean unused = MediaButtonIntentReceiver.f31278a = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "android.media.AUDIO_BECOMING_NOISY"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "button"
            if (r1 == 0) goto L_0x0015
            java.lang.String r4 = "ACTION_AUDIO_BECOMING_NOISY"
            android.util.Log.e(r2, r4)
            goto L_0x00c1
        L_0x0015:
            java.lang.String r1 = "android.intent.action.MEDIA_BUTTON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            android.os.Parcelable r5 = r5.getParcelableExtra(r0)
            android.view.KeyEvent r5 = (android.view.KeyEvent) r5
            java.lang.String r0 = "ACTION_MEDIA_BUTTON"
            android.util.Log.e(r2, r0)
            if (r5 != 0) goto L_0x002d
            return
        L_0x002d:
            int r0 = r5.getKeyCode()
            r5.getAction()
            r5.getEventTime()
            r5 = 79
            if (r0 == r5) goto L_0x0065
            r5 = 126(0x7e, float:1.77E-43)
            if (r0 == r5) goto L_0x005f
            r5 = 127(0x7f, float:1.78E-43)
            if (r0 == r5) goto L_0x0059
            switch(r0) {
                case 85: goto L_0x0065;
                case 86: goto L_0x0053;
                case 87: goto L_0x004d;
                case 88: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x00b2
        L_0x0047:
            java.lang.String r4 = "KEYCODE_MEDIA_PREVIOUS"
            android.util.Log.e(r2, r4)
            goto L_0x00b2
        L_0x004d:
            java.lang.String r4 = "KEYCODE_MEDIA_NEXT"
            android.util.Log.e(r2, r4)
            goto L_0x00b2
        L_0x0053:
            java.lang.String r4 = "KEYCODE_MEDIA_STOP"
            android.util.Log.e(r2, r4)
            goto L_0x00b2
        L_0x0059:
            java.lang.String r4 = "KEYCODE_MEDIA_PAUSE"
            android.util.Log.e(r2, r4)
            goto L_0x00b2
        L_0x005f:
            java.lang.String r4 = "KEYCODE_MEDIA_PLAY"
            android.util.Log.e(r2, r4)
            goto L_0x00b2
        L_0x0065:
            java.lang.String r5 = "KEYCODE_HEADSETHOOK KEYCODE_MEDIA_PLAY_PAUSE"
            android.util.Log.e(r2, r5)
            boolean r5 = p342g.p343a.p344a.p358i.C8315g.m45979a()
            if (r5 != 0) goto L_0x00b2
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action"
            r5.<init>(r0)
            android.content.Context r0 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            java.lang.String r0 = r0.getPackageName()
            android.content.Intent r5 = r5.setPackage(r0)
            r4.sendBroadcast(r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "media.musicplayer.audioplayer.videoplayer.UPWIDGET_LISTVIEW"
            r5.<init>(r0)
            android.content.Context r0 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            java.lang.String r0 = r0.getPackageName()
            android.content.Intent r5 = r5.setPackage(r0)
            r4.sendBroadcast(r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "media.musicplayer.audioplayer.videoplayer.BUTTON_PLAY_PAUSE"
            r5.<init>(r0)
            android.content.Context r0 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            java.lang.String r0 = r0.getPackageName()
            android.content.Intent r5 = r5.setPackage(r0)
            r4.sendBroadcast(r5)
        L_0x00b2:
            android.os.Handler r4 = f31279b
            r5 = 1
            r4.removeMessages(r5)
            boolean r4 = r3.isOrderedBroadcast()
            if (r4 == 0) goto L_0x00c1
            r3.abortBroadcast()
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.service.MediaButtonIntentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
