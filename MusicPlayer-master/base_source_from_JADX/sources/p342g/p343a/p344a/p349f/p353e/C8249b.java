package p342g.p343a.p344a.p349f.p353e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0885l;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7958k;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8311c;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.f.e.b */
/* compiled from: BaseTabImageFragment */
public abstract class C8249b extends Fragment implements C7958k {

    /* renamed from: d0 */
    protected ImageView f34594d0;

    /* renamed from: e0 */
    private List<C7958k> f34595e0;

    /* renamed from: f0 */
    private C8251b f34596f0;

    /* renamed from: g.a.a.f.e.b$a */
    /* compiled from: BaseTabImageFragment */
    class C8250a implements View.OnClickListener {
        C8250a() {
        }

        public void onClick(View view) {
            if (view.getId() == R.id.iv_image_1) {
                C8249b.this.mo29940g3();
            }
        }
    }

    /* renamed from: g.a.a.f.e.b$b */
    /* compiled from: BaseTabImageFragment */
    private class C8251b extends BroadcastReceiver {

        /* renamed from: g.a.a.f.e.b$b$a */
        /* compiled from: BaseTabImageFragment */
        class C8252a implements Runnable {
            C8252a() {
            }

            public void run() {
                C8249b.this.mo29939f3();
            }
        }

        private C8251b() {
        }

        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent != null && (action = intent.getAction()) != null) {
                if (action.equals("media.musicplayer.audioplayer.videoplayer.artwork_update_page")) {
                    C8249b.this.m45551n3();
                } else if (action.equals("media.musicplayer.audioplayer.videoplayer.clean_list")) {
                    C8249b bVar = C8249b.this;
                    if (bVar.f34594d0 != null) {
                        C8249b.this.f34594d0.setImageDrawable(C9332d.m49407d(bVar.mo3606L(), R.drawable.home_intermediate2_album_bg));
                    }
                    C8249b.this.mo29942j3();
                } else if (action.equals(C8311c.f34738e)) {
                    new Handler().postDelayed(new C8252a(), 500);
                } else if ("coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC".equals(action)) {
                    C8249b.this.mo29941i3();
                } else if ("media.musicplayer.audioplayer.videoplayer.detail_update_page".equals(action)) {
                    C8249b.this.mo29944p3();
                } else if ("media.musicplayer.audioplayer.videoplayer.add_to_favorite_list".equals(action)) {
                    C8249b.this.mo29937Y2();
                }
            }
        }

        /* synthetic */ C8251b(C8249b bVar, C8250a aVar) {
            this();
        }
    }

    /* renamed from: a3 */
    private void m45543a3() {
        if (C8287e.m45873v() != null) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.parser_lyric").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: b3 */
    private void m45544b3() {
        m45543a3();
    }

    /* renamed from: c3 */
    private void m45545c3(View view) {
        this.f34594d0 = (ImageView) view.findViewById(R.id.iv_image_1);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.iv_root);
    }

    /* renamed from: d3 */
    private void m45546d3() {
        if (mo3606L() != null) {
            this.f34596f0 = new C8251b(this, (C8250a) null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.artwork_update_page");
            intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.clean_list");
            intentFilter.addAction(C8311c.f34738e);
            intentFilter.addAction("coocent.musiclibrary.music.utils.LyricUtils_UPDATE_REPLACE_LYRIC");
            intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.detail_update_page");
            intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.add_to_favorite_list");
            mo3606L().registerReceiver(this.f34596f0, intentFilter);
        }
    }

    /* renamed from: e3 */
    static /* synthetic */ void m45547e3(boolean z) {
    }

    /* renamed from: h3 */
    private void m45548h3() {
        try {
            List<C7958k> list = this.f34595e0;
            if (list != null) {
                list.remove(this);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: k3 */
    private void m45549k3() {
        this.f34594d0.setOnClickListener(new C8250a());
        m45552o3();
    }

    /* renamed from: m3 */
    private void m45550m3() {
        m45551n3();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public void m45551n3() {
        if (C8287e.m45873v() != null) {
            String b = C8314f.m45973b(C8345u.m46327h(), 0, C8287e.m45873v().mo9215k(), C8287e.m45859o());
            Drawable d = C9332d.m49407d(mo3606L(), R.drawable.home_intermediate2_album_bg);
            int d2 = C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);
            C8321j.m45997c(b, d, this.f34594d0, d2, d2, C8248a.f34593a);
        }
    }

    /* renamed from: o3 */
    private void m45552o3() {
        if (C8287e.m45802Q() != null) {
            this.f34595e0 = C8287e.m45802Q().mo27195p0(this);
        }
    }

    /* renamed from: A */
    public void mo26484A() {
    }

    /* renamed from: A1 */
    public void mo26485A1(int i) {
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        m45548h3();
        ImageView imageView = this.f34594d0;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
            this.f34594d0.setImageBitmap((Bitmap) null);
            this.f34594d0.setBackground((Drawable) null);
            this.f34594d0 = null;
        }
        if (this.f34596f0 != null && mo3606L() != null) {
            mo3606L().unregisterReceiver(this.f34596f0);
            this.f34596f0 = null;
        }
    }

    /* renamed from: M0 */
    public void mo26486M0() {
        m45543a3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y2 */
    public void mo29937Y2() {
    }

    /* renamed from: Z */
    public void mo26487Z() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public void mo29938Z2() {
        if (mo3606L() != null) {
            mo3606L().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.call_artwork").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public abstract void mo29939f3();

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public abstract void mo29940g3();

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo29941i3() {
    }

    /* renamed from: j0 */
    public void mo26493j0(boolean z) {
        m45551n3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo29942j3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public void mo29943l3(View view) {
        m45545c3(view);
        m45544b3();
        m45550m3();
        m45549k3();
        m45546d3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p3 */
    public void mo29944p3() {
    }

    /* renamed from: u1 */
    public void mo26499u1() {
    }
}
