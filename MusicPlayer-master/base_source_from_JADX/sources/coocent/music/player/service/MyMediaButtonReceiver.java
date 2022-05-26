package coocent.music.player.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import p342g.p343a.p344a.p358i.C8319i;

public class MyMediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: e */
    private static C7074b f31340e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static int f31341f;

    /* renamed from: a */
    private Timer f31342a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8319i.C8320a f31343b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f31344c;

    /* renamed from: d */
    Handler f31345d;

    /* renamed from: coocent.music.player.service.MyMediaButtonReceiver$a */
    class C7073a extends Handler {
        C7073a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                MyMediaButtonReceiver.this.f31343b.mo30056a();
            } else if (i == 2) {
                MyMediaButtonReceiver.this.f31343b.mo30059d();
            } else if (i == 3) {
                MyMediaButtonReceiver.this.f31343b.mo30057b();
            }
        }
    }

    /* renamed from: coocent.music.player.service.MyMediaButtonReceiver$b */
    class C7074b extends TimerTask {
        C7074b() {
        }

        public void run() {
            try {
                if (MyMediaButtonReceiver.f31341f == 1) {
                    MyMediaButtonReceiver.this.f31345d.sendEmptyMessage(1);
                } else if (MyMediaButtonReceiver.f31341f == 2) {
                    MyMediaButtonReceiver.this.f31345d.sendEmptyMessage(2);
                }
                int unused = MyMediaButtonReceiver.f31341f = 0;
                boolean unused2 = MyMediaButtonReceiver.this.f31344c = false;
            } catch (Exception unused3) {
            }
        }
    }

    public MyMediaButtonReceiver() {
        this.f31342a = null;
        this.f31343b = null;
        this.f31344c = false;
        this.f31345d = new C7073a();
        this.f31342a = new Timer(true);
        this.f31343b = C8319i.m45987a().mo30055b();
    }

    /* renamed from: e */
    private void m40430e() {
        int i = f31341f;
        if (i == 0) {
            Log.e("MediaButton", "1击");
            f31341f++;
            C7074b bVar = new C7074b();
            f31340e = bVar;
            this.f31342a.schedule(bVar, 1000);
        } else if (i == 1) {
            Log.e("MediaButton", "2击");
            f31341f++;
        } else if (i == 2) {
            Log.e("MediaButton", "3击");
            f31341f = 0;
            f31340e.cancel();
            this.f31343b.mo30057b();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (this.f31343b != null) {
                try {
                    if (keyEvent.getKeyCode() == 85) {
                        this.f31344c = true;
                    } else if (keyEvent.getKeyCode() == 127) {
                        this.f31344c = true;
                    } else if (keyEvent.getKeyCode() == 79) {
                        this.f31344c = true;
                    } else if (keyEvent.getKeyCode() == 126) {
                        this.f31344c = true;
                    } else if (keyEvent.getKeyCode() == 86) {
                        this.f31343b.mo30060e();
                    } else if (keyEvent.getKeyCode() == 87) {
                        this.f31343b.mo30058c();
                    } else if (keyEvent.getKeyCode() == 88) {
                        this.f31343b.mo30061f();
                    }
                    if (keyEvent.getAction() == 1) {
                        Log.e("MediaButton", "ACTION_UP");
                        if (this.f31344c) {
                            Log.e("MediaButton", "isPlayPauseClick");
                            m40430e();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }
}
