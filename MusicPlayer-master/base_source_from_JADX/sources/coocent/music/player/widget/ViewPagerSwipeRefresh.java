package coocent.music.player.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coocent.musiclibrary.music.p292j.C7393h;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7968u;
import p342g.p343a.p344a.p358i.C8345u;

public class ViewPagerSwipeRefresh extends SwipeRefreshLayout {

    /* renamed from: b0 */
    int f31757b0;

    /* renamed from: c0 */
    int f31758c0;

    /* renamed from: d0 */
    private AlbumArtViewPager f31759d0;

    /* renamed from: e0 */
    private C7393h f31760e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public boolean f31761f0 = false;

    /* renamed from: g0 */
    private C7968u f31762g0;

    /* renamed from: h0 */
    private SwipeRefreshLayout.C1051j f31763h0 = new C7172a();

    /* renamed from: i0 */
    public Handler f31764i0 = new C7174c();

    /* renamed from: coocent.music.player.widget.ViewPagerSwipeRefresh$a */
    class C7172a implements SwipeRefreshLayout.C1051j {
        C7172a() {
        }

        /* renamed from: e1 */
        public void mo5827e1() {
            if (!ViewPagerSwipeRefresh.this.f31761f0) {
                ViewPagerSwipeRefresh.this.m40826F();
            }
        }
    }

    /* renamed from: coocent.music.player.widget.ViewPagerSwipeRefresh$b */
    class C7173b implements Runnable {
        C7173b() {
        }

        public void run() {
            SystemClock.sleep(500);
            Message message = new Message();
            message.what = 1;
            ViewPagerSwipeRefresh.this.f31764i0.sendMessage(message);
        }
    }

    /* renamed from: coocent.music.player.widget.ViewPagerSwipeRefresh$c */
    class C7174c extends Handler {
        C7174c() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                ViewPagerSwipeRefresh.this.m40825E();
                ViewPagerSwipeRefresh.this.setRefreshing(false);
                boolean unused = ViewPagerSwipeRefresh.this.f31761f0 = false;
                C8345u.m46340u(R.string.change_viewpager_type_success);
            }
            super.handleMessage(message);
        }
    }

    public ViewPagerSwipeRefresh(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m40825E() {
        setType(Math.abs((this.f31760e0.mo28188j() + 1) % 16));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m40826F() {
        this.f31761f0 = true;
        new Thread(new C7173b()).start();
    }

    private void setType(int i) {
        this.f31762g0.mo29492a(i);
        this.f31759d0.setCurrentType(i);
        this.f31760e0.mo28196r(this.f31759d0.getCurrentType());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31757b0 = (int) motionEvent.getRawX();
            this.f31758c0 = (int) motionEvent.getRawY();
        } else if (action == 2) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (Math.abs(rawX - this.f31757b0) < 10 || Math.abs(rawY - this.f31758c0) < 10 || Math.abs(rawX - this.f31757b0) > Math.abs(rawY - this.f31758c0)) {
                return false;
            }
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnReFreshListener(C7968u uVar) {
        this.f31762g0 = uVar;
    }

    public void setViewPager(AlbumArtViewPager albumArtViewPager) {
        this.f31759d0 = albumArtViewPager;
        this.f31760e0 = C7393h.m41695f(C8345u.m46327h());
        setOnRefreshListener(this.f31763h0);
    }

    public ViewPagerSwipeRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
