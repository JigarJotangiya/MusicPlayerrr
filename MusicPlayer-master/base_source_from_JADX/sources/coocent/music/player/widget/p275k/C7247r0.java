package coocent.music.player.widget.p275k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import coocent.music.player.adapter.SoundEffectMoreAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7058c;
import coocent.music.player.mode.SoundEffect;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7963p;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.widget.k.r0 */
/* compiled from: SoundEffectMorePopu */
public class C7247r0 extends C7217j0 {

    /* renamed from: k */
    private List<C7058c> f32015k = new ArrayList();

    /* renamed from: l */
    private Context f32016l;

    /* renamed from: m */
    private View f32017m;

    /* renamed from: n */
    private RecyclerView f32018n;

    /* renamed from: o */
    private ImageView f32019o;

    /* renamed from: p */
    private SoundEffectMoreAdapter f32020p;

    /* renamed from: q */
    private View f32021q;

    public C7247r0(Context context) {
        super(context);
        C8337n.m46065k0(C8345u.m46327h());
        this.f32016l = context;
        m41113o();
        m41117w();
    }

    /* renamed from: l */
    private void m41111l() {
        C7963p pVar = this.f31889h;
        if (pVar != null) {
            pVar.mo26508U();
        }
    }

    /* renamed from: n */
    private void m41112n() {
        C7963p pVar = this.f31889h;
        if (pVar != null) {
            pVar.mo26516m1((ArrayList<SoundEffect>) null);
        }
    }

    /* renamed from: o */
    private void m41113o() {
        this.f32017m = LayoutInflater.from(this.f32016l).inflate(R.layout.sound_effect_more_list, (ViewGroup) null);
        m41118x();
        this.f32019o = (ImageView) this.f32017m.findViewById(R.id.iv_play_backgroud);
        this.f32021q = this.f32017m.findViewById(R.id.rl_bottom);
        this.f32018n = (RecyclerView) this.f32017m.findViewById(R.id.recyclerview);
        RelativeLayout relativeLayout = (RelativeLayout) this.f32017m.findViewById(R.id.rl_content);
        ((C0916y) this.f32018n.getItemAnimator()).mo5428V(false);
        this.f32018n.setLayoutManager(new GridLayoutManager(this.f32016l, 3));
        SoundEffectMoreAdapter soundEffectMoreAdapter = new SoundEffectMoreAdapter(R.layout.item_sound_effect_edit, this.f32015k);
        this.f32020p = soundEffectMoreAdapter;
        soundEffectMoreAdapter.setHasStableIds(true);
        this.f32018n.setAdapter(this.f32020p);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo27821q(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (i == 0) {
            m41112n();
        } else if (i == 1) {
            m41116t();
        } else if (i == 2) {
            m41111l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo27822s(View view) {
        if (view.getId() == R.id.rl_bottom) {
            dismiss();
        }
    }

    /* renamed from: t */
    private void m41116t() {
        C7963p pVar = this.f31889h;
        if (pVar != null) {
            pVar.mo26518r1();
        }
    }

    /* renamed from: w */
    private void m41117w() {
        this.f32020p.setOnItemClickListener(new C7195a0(this));
        this.f32021q.setOnClickListener(new C7261z(this));
    }

    /* renamed from: x */
    private void m41118x() {
        setWidth(C8345u.m46331l());
        setHeight(-2);
        setContentView(this.f32017m);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(R.style.nowplaylist);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo27742i() {
        super.mo27742i();
    }

    /* renamed from: k */
    public void mo27743k(View view) {
        super.mo27743k(view);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (BaseApplication.f31159w && BaseApplication.f31158v) {
            setSoftInputMode(48);
        }
        showAtLocation(view, 83, 0, -iArr[1]);
        setOnDismissListener(this.f31891j);
        mo27823u();
    }

    /* renamed from: m */
    public void mo27820m() {
        ImageView imageView = this.f32019o;
        if (imageView != null) {
            imageView.setBackground((Drawable) null);
            this.f32019o.setImageBitmap((Bitmap) null);
            this.f32019o.setImageDrawable((Drawable) null);
            this.f32019o = null;
        }
        List<C7058c> list = this.f32015k;
        if (list != null) {
            list.clear();
            this.f32015k = null;
        }
        if (this.f32017m != null) {
            this.f32017m = null;
        }
        if (this.f32018n != null) {
            this.f32018n = null;
        }
        if (this.f32020p != null) {
            this.f32020p = null;
        }
        C8321j.m45995a(this.f32019o);
    }

    /* renamed from: u */
    public void mo27823u() {
    }

    /* renamed from: v */
    public void mo27824v() {
        List<C7058c> list = this.f32015k;
        if (list != null) {
            list.clear();
        } else {
            this.f32015k = new ArrayList();
        }
        String[] f = C8345u.m46325f(R.array.sound_effect_edit);
        for (int i = 0; i < f.length; i++) {
            C7058c cVar = new C7058c();
            cVar.mo27085b(i);
            cVar.mo27086c(f[i]);
            this.f32015k.add(cVar);
        }
        this.f32020p.notifyDataSetChanged();
    }
}
