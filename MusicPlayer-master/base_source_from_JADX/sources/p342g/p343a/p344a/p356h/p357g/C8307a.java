package p342g.p343a.p344a.p356h.p357g;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p281b.C7324c;
import coocent.musiclibrary.music.p283d.C7326a;
import coocent.musiclibrary.music.p284e.C7332e;
import coocent.musiclibrary.music.p292j.C7382d;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p356h.C8295b;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.h.g.a */
/* compiled from: AlbumMenuPopup */
public class C8307a extends C8295b implements View.OnClickListener {

    /* renamed from: E */
    private List<Music> f34723E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f34724F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public long f34725G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f34726H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C7324c f34727I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f34728J = -1;

    /* renamed from: K */
    private Context f34729K;

    /* renamed from: g.a.a.h.g.a$a */
    /* compiled from: AlbumMenuPopup */
    class C8308a implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f34730a;

        C8308a(C7332e eVar) {
            this.f34730a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            if (C8307a.this.f34727I != null) {
                C7324c W = C8307a.this.f34727I;
                int Z = C8307a.this.f34728J;
                long X = C8307a.this.f34725G;
                int Y = C8307a.this.f34724F;
                W.mo28061D(Z, X, Y, "album " + C8307a.this.f34726H);
            }
            this.f34730a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            if (C8307a.this.f34727I != null) {
                C8307a.this.f34727I.mo28063r(C8307a.this.f34725G, C8307a.this.f34724F);
            }
            this.f34730a.dismiss();
        }

        /* renamed from: c */
        public void mo26722c() {
            if (C8307a.this.f34727I != null) {
                C7324c W = C8307a.this.f34727I;
                int Z = C8307a.this.f34728J;
                long X = C8307a.this.f34725G;
                int Y = C8307a.this.f34724F;
                W.mo28065u(Z, X, Y, "album " + C8307a.this.f34726H);
            }
            this.f34730a.dismiss();
        }
    }

    public C8307a(Activity activity, int i) {
        super(activity, -2, -2);
        this.f34729K = activity;
        this.f34728J = i;
        m45947d0();
    }

    /* renamed from: b0 */
    private void m45945b0() {
        m45949h0();
        mo30018u();
    }

    /* renamed from: c0 */
    private void m45946c0() {
        long[] E = C8287e.m45778E(C7326a.m41490a(C8345u.m46327h(), this.f34725G, BaseApplication.f31150n));
        if (E != null && E.length > 0) {
            C7382d.m41678i(mo30021x(), "this album", E, C9332d.m49405b(mo30021x(), R.color.colorAccent), C8345u.m46326g(R.color.white), C8345u.m46326g(R.color.color_bbb), this.f34727I);
        }
        mo30018u();
    }

    /* renamed from: d0 */
    private void m45947d0() {
        mo30019v(R.id.play).setOnClickListener(this);
        mo30019v(R.id.delete).setOnClickListener(this);
        mo30019v(R.id.artwork).setOnClickListener(this);
        mo30004L(true);
    }

    /* renamed from: e0 */
    private void m45948e0() {
        List<Music> list = this.f34723E;
        if (list != null && list.size() > 0) {
            C8287e.m45858n0(true);
            C8287e.m45823a0(0, this.f34723E);
            mo30018u();
        }
    }

    /* renamed from: h0 */
    private void m45949h0() {
        Context context = this.f34729K;
        C7332e eVar = new C7332e(context, context.getResources().getString(R.string.button1), this.f34729K.getResources().getString(R.string.button2), this.f34729K.getResources().getString(R.string.button3), this.f34729K.getResources().getString(R.string.artist_work), this.f34729K.getResources().getString(R.string.artist_work_tip), C9332d.m49405b(mo30021x(), R.color.colorAccent), C8345u.m46326g(R.color.color_bbb), this.f34729K.getResources().getColor(R.color.white), false, true);
        eVar.requestWindowFeature(1);
        eVar.show();
        eVar.mo28071c(new C8308a(eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public Animation mo30002H() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(mo29997C(1.0f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 0.0f));
        animationSet.addAnimation(mo30022y());
        return animationSet;
    }

    /* renamed from: I */
    public Animator mo30003I() {
        return null;
    }

    /* renamed from: U */
    public void mo30013U(View view) {
        mo30007O(-(mo29999E() - (view.getWidth() / 2)));
        mo30008P((-view.getHeight()) / 2);
        super.mo30013U(view);
    }

    /* renamed from: b */
    public View mo29993b() {
        return mo29996B().findViewById(R.id.popup_contianer);
    }

    /* renamed from: f */
    public View mo29994f() {
        return mo30017t(R.layout.popup_artist_menu);
    }

    /* renamed from: f0 */
    public void mo30041f0(long j, int i, String str) {
        this.f34725G = j;
        this.f34726H = str;
        this.f34724F = i;
        this.f34723E = C4477c.m19635o(C8345u.m46327h(), j);
    }

    /* renamed from: g0 */
    public void mo30042g0(C7324c cVar) {
        this.f34727I = cVar;
    }

    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.artwork) {
            m45945b0();
        } else if (id == R.id.delete) {
            m45946c0();
        } else if (id == R.id.play) {
            m45948e0();
        }
    }

    /* renamed from: w */
    public View mo30020w() {
        return null;
    }
}
