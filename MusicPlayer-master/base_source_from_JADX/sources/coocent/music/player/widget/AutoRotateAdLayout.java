package coocent.music.player.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import coocent.music.player.widget.stereoview.StereoView;

public class AutoRotateAdLayout extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f31462g = -1;

    /* renamed from: h */
    private int f31463h = 10000;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public StereoView f31464i;

    /* renamed from: j */
    private Handler f31465j = new C7126a();

    /* renamed from: coocent.music.player.widget.AutoRotateAdLayout$a */
    class C7126a extends Handler {
        C7126a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            int i2 = 0;
            if (i == 1) {
                int curScreen = 2 - AutoRotateAdLayout.this.f31464i.getCurScreen();
                if (curScreen > 0) {
                    while (i2 < curScreen) {
                        AutoRotateAdLayout.this.f31464i.mo28024h();
                        i2++;
                    }
                } else if (curScreen < 0) {
                    int i3 = -curScreen;
                    while (i2 < i3) {
                        AutoRotateAdLayout.this.f31464i.mo28025k();
                        i2++;
                    }
                } else {
                    int b = 2 - AutoRotateAdLayout.this.f31462g;
                    if (b > 0) {
                        while (i2 < b) {
                            AutoRotateAdLayout.this.f31464i.mo28025k();
                            i2++;
                        }
                    } else {
                        int i4 = -b;
                        while (i2 < i4) {
                            AutoRotateAdLayout.this.f31464i.mo28024h();
                            i2++;
                        }
                    }
                }
                AutoRotateAdLayout.this.mo27380c();
            } else if (i == 2) {
                int curScreen2 = AutoRotateAdLayout.this.f31464i.getCurScreen() - 2;
                if (curScreen2 > 0) {
                    while (i2 < curScreen2) {
                        AutoRotateAdLayout.this.f31464i.mo28025k();
                        i2++;
                    }
                } else if (curScreen2 < 0) {
                    int i5 = -curScreen2;
                    while (i2 < i5) {
                        AutoRotateAdLayout.this.f31464i.mo28024h();
                        i2++;
                    }
                }
                AutoRotateAdLayout.this.mo27380c();
            }
        }
    }

    public AutoRotateAdLayout(Context context) {
        super(context);
    }

    /* renamed from: c */
    public void mo27380c() {
        if (this.f31464i.getCurScreen() != 2) {
            this.f31465j.sendEmptyMessageDelayed(2, (long) this.f31463h);
        } else {
            this.f31465j.sendEmptyMessageDelayed(1, (long) this.f31463h);
        }
    }

    /* renamed from: d */
    public void mo27381d() {
        Handler handler = this.f31465j;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            mo27381d();
        } else if (action == 1) {
            mo27381d();
            mo27380c();
        } else if (action == 3) {
            mo27381d();
            mo27380c();
        }
        return super.onTouchEvent(motionEvent);
    }

    public AutoRotateAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoRotateAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
