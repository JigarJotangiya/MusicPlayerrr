package p342g.p343a.p344a.p349f.p351c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.coocent.music.base.data.entity.Music;
import com.google.android.material.tabs.C6210c;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.adapter.C7023f;
import coocent.music.player.base.BaseApplication;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p349f.C8010a;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8313e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.f.c.e3 */
/* compiled from: SearchFragment */
public class C8090e3 extends C8010a {

    /* renamed from: t0 */
    public static String f34149t0 = C8090e3.class.getSimpleName();

    /* renamed from: i0 */
    private View f34150i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public TabLayout f34151j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public ViewPager2 f34152k0;

    /* renamed from: l0 */
    private ImageView f34153l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public AppCompatImageView f34154m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public EditText f34155n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public int f34156o0;

    /* renamed from: p0 */
    private ImageView f34157p0;

    /* renamed from: q0 */
    private ConstraintLayout f34158q0;

    /* renamed from: r0 */
    private C8092b f34159r0;

    /* renamed from: s0 */
    private long f34160s0 = -1;

    /* renamed from: g.a.a.f.c.e3$a */
    /* compiled from: SearchFragment */
    class C8091a implements TextWatcher {
        C8091a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0) {
                C8090e3.this.f34154m0.setVisibility(0);
            } else {
                C8090e3.this.f34154m0.setVisibility(8);
            }
            BaseApplication.f31146j = charSequence.toString();
            Context h = C8345u.m46327h();
            h.sendBroadcast(new Intent(C8090e3.this.f34156o0 + "search_update").setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    /* renamed from: g.a.a.f.c.e3$b */
    /* compiled from: SearchFragment */
    private class C8092b extends BroadcastReceiver {
        private C8092b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.search_result")) {
                if (C8090e3.this.f34155n0 == null) {
                    return;
                }
                if (C8090e3.this.f34155n0.getText().toString().isEmpty()) {
                    C8090e3.this.f34151j0.setVisibility(8);
                    C8090e3.this.f34152k0.setVisibility(8);
                    return;
                }
                if (C8090e3.this.f34156o0 != 4) {
                    C8090e3.this.f34151j0.setVisibility(0);
                }
                C8090e3.this.f34152k0.setVisibility(0);
            } else if (intent.getAction().equals("media.musicplayer.audioplayer.videoplayer.close_soft") && C8090e3.this.f34155n0 != null) {
                C8090e3.this.f34155n0.clearFocus();
            }
        }

        /* synthetic */ C8092b(C8090e3 e3Var, C8091a aVar) {
            this();
        }
    }

    /* renamed from: A3 */
    private void m44531A3() {
        try {
            List<Music> O = C8287e.m45798O();
            if (O != null) {
                if (O.size() != 0) {
                    long[] jArr = new long[O.size()];
                    for (int i = 0; i < O.size(); i++) {
                        jArr[i] = O.get(i).mo9215k();
                    }
                    int a = C4477c.m19607a(C8345u.m46327h(), jArr, this.f34160s0);
                    if (a > 0) {
                        C8344t.m46316d(C8345u.m46327h(), R.string.music_eq_msg_add_songs_to_playlist_ok);
                        C8345u.m46327h().sendBroadcast(new Intent("ADD_TO_PLAYLIST").setPackage(C8345u.m46327h().getPackageName()));
                        FragmentActivity L = mo3606L();
                        if (L instanceof LibraryActivity) {
                            LibraryActivity libraryActivity = (LibraryActivity) L;
                            libraryActivity.mo3730H1().mo3920J0(C8061b3.f34055L0, 0);
                            libraryActivity.mo26668h5();
                            return;
                        }
                        return;
                    } else if (a == -1) {
                        C8344t.m46316d(C8345u.m46327h(), R.string.already_exists);
                        return;
                    } else {
                        return;
                    }
                }
            }
            C8344t.m46316d(C8345u.m46327h(), R.string.not_select_file);
        } catch (Exception e) {
            e.printStackTrace();
            C8344t.m46316d(C8345u.m46327h(), R.string.error);
        }
    }

    /* renamed from: B3 */
    private void m44532B3() {
        mo29552e3(this.f34153l0);
        m44550z3();
    }

    /* renamed from: C3 */
    private void m44533C3() {
        C8048a2 a2Var = new C8048a2(this);
        this.f34153l0.setOnClickListener(a2Var);
        this.f34154m0.setOnClickListener(a2Var);
        this.f34158q0.setOnClickListener(a2Var);
        this.f34157p0.setOnClickListener(a2Var);
        this.f34155n0.addTextChangedListener(new C8091a());
    }

    /* renamed from: m3 */
    private void m44539m3() {
        this.f34155n0.setText(BuildConfig.FLAVOR);
        BaseApplication.f31146j = BuildConfig.FLAVOR;
        Context h = C8345u.m46327h();
        h.sendBroadcast(new Intent(this.f34156o0 + "search_update").setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: n3 */
    private void m44540n3() {
        Bundle V = mo3638V();
        if (V != null) {
            this.f34156o0 = V.getInt("pageType");
            this.f34160s0 = V.getLong("playlistId");
        }
    }

    /* renamed from: o3 */
    private void m44541o3() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            L.onBackPressed();
        }
    }

    /* renamed from: p3 */
    private void m44542p3() {
        this.f34152k0.setAdapter(new C7023f(mo3606L(), this.f34156o0, this.f34160s0));
        this.f34152k0.setOffscreenPageLimit(4);
        if (this.f34156o0 == 4) {
            this.f34151j0.setVisibility(8);
            this.f34157p0.setVisibility(0);
            return;
        }
        new C6210c(this.f34151j0, this.f34152k0, C8230y1.f34525a).mo24836a();
    }

    /* renamed from: q3 */
    private void m44543q3() {
        this.f34159r0 = new C8092b(this, (C8091a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.search_result");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.close_soft");
        mo3606L().registerReceiver(this.f34159r0, intentFilter);
    }

    /* renamed from: r3 */
    private void m44544r3() {
        TabLayout tabLayout = (TabLayout) this.f34150i0.findViewById(R.id.tabLayout);
        this.f34151j0 = tabLayout;
        tabLayout.mo24728K(C8343s.m46295c(R.color.artist_detail_tab_text_color), C8343s.m46300h());
        this.f34151j0.setTabRippleColor(ColorStateList.valueOf(C8343s.m46295c(R.color.ripple_color)));
        this.f34151j0.setSelectedTabIndicatorColor(C8343s.m46300h());
        this.f34152k0 = (ViewPager2) this.f34150i0.findViewById(R.id.viewPager2);
        this.f34153l0 = (ImageView) this.f34150i0.findViewById(R.id.back);
        this.f34154m0 = (AppCompatImageView) this.f34150i0.findViewById(R.id.clear_text);
        EditText editText = (EditText) this.f34150i0.findViewById(R.id.et_search);
        this.f34155n0 = editText;
        editText.setInputType(1);
        this.f34158q0 = (ConstraintLayout) this.f34150i0.findViewById(R.id.search_root);
        this.f34155n0.setTextColor(C8343s.m46295c(R.color.default_text_color));
        this.f34155n0.setHintTextColor(C8343s.m46295c(R.color.app_sub_title_color));
        ImageView imageView = (ImageView) this.f34150i0.findViewById(R.id.iv_done);
        this.f34157p0 = imageView;
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_toolbar_04, R.color.default_text_color));
        ((RelativeLayout) this.f34150i0.findViewById(R.id.search_layout)).setBackground(C8343s.m46298f(R.drawable.search_shape));
        C8343s.m46307o((ImageView) this.f34150i0.findViewById(R.id.iv_bg), false);
        C8345u.m46320a((ConstraintLayout) this.f34150i0.findViewById(R.id.search_title), (TextView) this.f34150i0.findViewById(R.id.fillView));
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void mo29693u3() {
        this.f34155n0.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) mo3651a0().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f34155n0, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void mo29694w3(View view) {
        int id = view.getId();
        if (id == R.id.back) {
            m44541o3();
        } else if (id == R.id.clear_text) {
            m44539m3();
        } else if (id == R.id.iv_done) {
            m44531A3();
        }
    }

    /* renamed from: x3 */
    public static C8090e3 m44548x3(int i) {
        return m44549y3(i, -1);
    }

    /* renamed from: y3 */
    public static C8090e3 m44549y3(int i, long j) {
        Bundle bundle = new Bundle();
        C8090e3 e3Var = new C8090e3();
        bundle.putInt("pageType", i);
        bundle.putLong("playlistId", j);
        e3Var.mo3581C2(bundle);
        return e3Var;
    }

    /* renamed from: z3 */
    private void m44550z3() {
        this.f34155n0.postDelayed(new C8238z1(this), 500);
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        BaseApplication.f31146j = BuildConfig.FLAVOR;
        C8287e.m45793L0(false);
        if (this.f34159r0 != null) {
            FragmentActivity L = mo3606L();
            if (L != null) {
                L.unregisterReceiver(this.f34159r0);
            }
            this.f34159r0 = null;
        }
        C8345u.m46322c(mo3606L());
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        super.mo3636U1(view, bundle);
        FragmentActivity L = mo3606L();
        if (L instanceof LibraryActivity) {
            ((LibraryActivity) L).mo26681s3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public String mo29549b3() {
        return C8090e3.class.getSimpleName();
    }

    /* renamed from: p1 */
    public Animation mo3691p1(int i, boolean z, int i2) {
        if (z) {
            int c = C8313e.m45969c();
            if (c == 0) {
                return super.mo3691p1(i, z, i2);
            }
            return AnimationUtils.loadAnimation(mo3606L(), c);
        }
        int d = C8313e.m45970d();
        if (d == 0) {
            return super.mo3691p1(i, z, i2);
        }
        return AnimationUtils.loadAnimation(mo3606L(), d);
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34150i0 = layoutInflater.inflate(R.layout.fragment_search, (ViewGroup) null);
        m44540n3();
        m44544r3();
        m44542p3();
        m44532B3();
        m44533C3();
        m44543q3();
        return this.f34150i0;
    }
}
