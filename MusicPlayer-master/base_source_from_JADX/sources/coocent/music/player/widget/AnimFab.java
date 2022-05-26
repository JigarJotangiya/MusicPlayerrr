package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import media.musicplayer.audioplayer.videoplayer.R;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;
import p082e.p137o.p138a.p139a.C4098c;
import p342g.p343a.p344a.p346c.C7952e;
import p342g.p343a.p344a.p346c.C7966s;
import p342g.p343a.p344a.p348e.C7992k;
import p342g.p343a.p344a.p349f.p351c.C8049a3;
import p342g.p343a.p344a.p349f.p351c.C8239z2;
import p443m.p444a.p447e.p448a.C9332d;

public class AnimFab extends FloatingActionButton implements C7952e {

    /* renamed from: z */
    private static final Interpolator f31449z = new C4098c();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C0602j f31450y;

    /* renamed from: coocent.music.player.widget.AnimFab$a */
    class C7123a implements View.OnClickListener {
        C7123a() {
        }

        public void onClick(View view) {
            C7992k m3 = C7992k.m43712m3();
            m3.mo29536p3(AnimFab.this);
            m3.mo3841h3(AnimFab.this.f31450y, "CREATE_PLAYLIST");
        }
    }

    /* renamed from: coocent.music.player.widget.AnimFab$b */
    class C7124b implements View.OnClickListener {
        C7124b(AnimFab animFab) {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: coocent.music.player.widget.AnimFab$c */
    class C7125c implements C3706a0 {
        C7125c() {
        }

        /* renamed from: a */
        public void mo1916a(View view) {
        }

        /* renamed from: b */
        public void mo585b(View view) {
            AnimFab.this.setVisibility(8);
        }

        /* renamed from: c */
        public void mo586c(View view) {
        }
    }

    public AnimFab(Context context) {
        super(context);
    }

    private void setAddPlaylistClickListener(int i) {
        setOnClickListener(new C7123a());
    }

    private void setShuffleListener(int i) {
        setOnClickListener(new C7124b(this));
    }

    /* renamed from: w */
    private void m40534w() {
        C3790z d = C3774v.m16194d(this);
        d.mo13226d(1.0f);
        d.mo13227e(1.0f);
        d.mo13234m(0.0f);
        d.mo13223a(1.0f);
        d.mo13229g(f31449z);
        d.mo13235n();
        d.mo13230h((C3706a0) null);
        d.mo13233l();
        setVisibility(0);
    }

    /* renamed from: x */
    private void m40535x() {
        if (getVisibility() != 8) {
            C3790z d = C3774v.m16194d(this);
            d.mo13226d(0.0f);
            d.mo13227e(0.0f);
            d.mo13234m((float) (getHeight() + m40536y(this)));
            d.mo13223a(0.0f);
            d.mo13229g(f31449z);
            d.mo13235n();
            d.mo13230h(new C7125c());
            d.mo13233l();
        }
    }

    /* renamed from: y */
    private int m40536y(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    /* renamed from: z */
    private void m40537z() {
        setBackgroundTintList(C9332d.m49406c(getContext(), R.color.colorAccent));
    }

    /* renamed from: p */
    public void mo27366p() {
        Fragment a = C8239z2.m45496a(3);
        if ((a instanceof C8049a3) && a != null) {
            ((C8049a3) a).mo29610k3(false);
        }
    }

    public void setCurrentPosition(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            m40535x();
        } else if (i == 6) {
            setBackgroundTintList(C9332d.m49406c(getContext(), R.color.colorAccent));
            setAddPlaylistClickListener(i);
            m40534w();
        }
    }

    public void setFragmentManager(C0602j jVar) {
        this.f31450y = jVar;
    }

    public void setShaffleCallBack(C7966s sVar) {
    }

    public AnimFab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40537z();
    }

    public AnimFab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
