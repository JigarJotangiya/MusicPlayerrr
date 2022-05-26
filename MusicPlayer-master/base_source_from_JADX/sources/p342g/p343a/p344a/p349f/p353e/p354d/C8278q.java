package p342g.p343a.p344a.p349f.p353e.p354d;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0885l;
import com.coocent.visualizerlibrary.DropVisualizerView;
import coocent.music.player.widget.ArcProgressView;
import coocent.music.player.widget.RotatView;
import coocent.musiclibrary.music.p290h.C7367a;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8284c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.e.d.q */
/* compiled from: TabVolumeBoosterFragment */
public class C8278q extends Fragment {

    /* renamed from: d0 */
    public DropVisualizerView f34656d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public ArcProgressView f34657e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public RotatView f34658f0;

    /* renamed from: g0 */
    private TextView f34659g0;

    /* renamed from: h0 */
    private TextView f34660h0;

    /* renamed from: i0 */
    private TextView f34661i0;

    /* renamed from: j0 */
    private TextView f34662j0;

    /* renamed from: k0 */
    private TextView f34663k0;

    /* renamed from: l0 */
    private TextView[] f34664l0;

    /* renamed from: m0 */
    private C8280b f34665m0;

    /* renamed from: n0 */
    private ImageView f34666n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public boolean f34667o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public Vibrator f34668p0;

    /* renamed from: g.a.a.f.e.d.q$a */
    /* compiled from: TabVolumeBoosterFragment */
    class C8279a implements RotatView.C7165b {
        C8279a() {
        }

        /* renamed from: a */
        public void mo27586a(float f) {
        }

        /* renamed from: b */
        public void mo27587b() {
        }

        @SuppressLint({"SetTextI18n"})
        /* renamed from: c */
        public void mo27588c(float f) {
            C8278q.this.f34657e0.setDegree(f);
            float f2 = ((f - 28.0f) * 200.0f) / 304.0f;
            C8287e.m45811U0(f2);
            C8278q.this.m45713m3((int) f2);
            if (C8278q.this.f34667o0) {
                C8278q.this.f34668p0.vibrate(new long[]{0, 10}, -1);
            }
        }
    }

    /* renamed from: d3 */
    private void m45705d3() {
        this.f34667o0 = C8337n.m46065k0(C8345u.m46327h()).mo30167X0();
        this.f34668p0 = (Vibrator) C8345u.m46327h().getSystemService("vibrator");
    }

    /* renamed from: e3 */
    private void m45706e3() {
        this.f34665m0 = new C8280b(this, (C8279a) null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.volume_down");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.volume_up");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.max_system_volume");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.music_state_change");
        intentFilter.addAction("media.musicplayer.audioplayer.videoplayer.audio_permission_change");
        mo3606L().registerReceiver(this.f34665m0, intentFilter);
    }

    /* renamed from: f3 */
    private void m45707f3(View view) {
        m45708g3(view);
        ArcProgressView arcProgressView = (ArcProgressView) view.findViewById(R.id.ac_volume_bg);
        RotatView rotatView = (RotatView) view.findViewById(R.id.rv_volume);
        this.f34658f0 = rotatView;
        rotatView.mo27619e();
        ArcProgressView arcProgressView2 = (ArcProgressView) view.findViewById(R.id.ac_volume_level);
        this.f34657e0 = arcProgressView2;
        arcProgressView2.mo27372b();
        this.f34659g0 = (TextView) view.findViewById(R.id.tv_volume);
        this.f34666n0 = (ImageView) view.findViewById(R.id.iv_volume);
        this.f34660h0 = (TextView) view.findViewById(R.id.tv_100);
        this.f34661i0 = (TextView) view.findViewById(R.id.tv_50);
        this.f34662j0 = (TextView) view.findViewById(R.id.tv_150);
        TextView textView = (TextView) view.findViewById(R.id.tv_max);
        this.f34663k0 = textView;
        this.f34664l0 = new TextView[]{this.f34661i0, this.f34660h0, this.f34662j0, textView};
        this.f34658f0.setArc(28);
        arcProgressView.setDegree(360.0f);
        float l3 = m45712l3();
        arcProgressView.setImageResource(2131231043);
        m45713m3((int) (((l3 - 28.0f) * 200.0f) / 304.0f));
    }

    /* renamed from: g3 */
    private void m45708g3(View view) {
        try {
            this.f34656d0 = (DropVisualizerView) view.findViewById(R.id.dropVisualizerView);
            C7367a B = C8287e.m45772B();
            this.f34656d0.mo10580r(B == null ? 0 : B.mo28126e(), C8287e.m45812V());
            this.f34656d0.setCylinderHeight(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void mo29978i3(View view) {
        switch (view.getId()) {
            case R.id.tv_100:
                m45711k3(100.0f);
                return;
            case R.id.tv_150:
                m45711k3(150.0f);
                return;
            case R.id.tv_50:
                m45711k3(50.0f);
                return;
            case R.id.tv_max:
                m45711k3(200.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: j3 */
    public static Fragment m45710j3() {
        return new C8278q();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: k3 */
    private void m45711k3(float f) {
        float f2 = ((304.0f * f) / 200.0f) + 28.0f;
        this.f34658f0.setDegree(f2);
        this.f34658f0.invalidate();
        this.f34657e0.setDegree(f2);
        m45713m3((int) f);
        C8287e.m45811U0(f);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: l3 */
    private float m45712l3() {
        int i;
        if (C8287e.m45784H() >= C8287e.m45786I()) {
            int d = C8284c.m45741d(C8345u.m46327h());
            if (d == 0) {
                i = (((C8287e.m45784H() * 304) * 100) / C8287e.m45786I()) / C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION;
            } else {
                i = ((d * 2) * 304) / C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION;
            }
        } else {
            i = (((C8287e.m45784H() * 304) * 100) / C8287e.m45786I()) / C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION;
        }
        float f = ((float) i) + 28.0f;
        RotatView rotatView = this.f34658f0;
        if (rotatView != null) {
            rotatView.setDegree(f);
        }
        ArcProgressView arcProgressView = this.f34657e0;
        if (arcProgressView != null) {
            arcProgressView.setDegree(f);
        }
        TextView textView = this.f34659g0;
        if (textView != null) {
            textView.setText(((int) (((f - 28.0f) * 200.0f) / 304.0f)) + "%");
        }
        m45713m3((int) (((f - 28.0f) * 200.0f) / 304.0f));
        return f;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n", "UseCompatLoadingForDrawables"})
    /* renamed from: m3 */
    public void m45713m3(int i) {
        ImageView imageView = this.f34666n0;
        if (imageView != null && this.f34659g0 != null && this.f34664l0 != null) {
            if (i == 0) {
                imageView.setImageResource(R.drawable.ic_eq_mute);
            } else if (i > 100) {
                imageView.setImageResource(R.drawable.ic_eq_max);
            } else {
                imageView.setImageResource(R.drawable.ic_eq_sound);
            }
            TextView textView = this.f34659g0;
            textView.setText(i + "%");
            int i2 = 0;
            while (true) {
                TextView[] textViewArr = this.f34664l0;
                if (i2 < textViewArr.length) {
                    if (i == 50 && i2 == 0) {
                        textViewArr[0].setTextColor(mo3698s0().getColor(R.color.white));
                        this.f34664l0[0].setBackground(C8343s.m46303k(R.drawable.volume_precent_on_shape, R.color.colorAccent));
                    } else if (i == 100 && i2 == 1) {
                        textViewArr[1].setTextColor(mo3698s0().getColor(R.color.white));
                        this.f34664l0[1].setBackground(C8343s.m46303k(R.drawable.volume_precent_on_shape, R.color.colorAccent));
                    } else if (i == 150 && i2 == 2) {
                        textViewArr[2].setTextColor(mo3698s0().getColor(R.color.white));
                        this.f34664l0[2].setBackground(C8343s.m46303k(R.drawable.volume_precent_on_shape, R.color.colorAccent));
                    } else if (i == 200 && i2 == 3) {
                        textViewArr[3].setTextColor(mo3698s0().getColor(R.color.white));
                        this.f34664l0[3].setBackground(C8343s.m46303k(R.drawable.volume_precent_on_shape, R.color.colorAccent));
                    } else {
                        try {
                            textViewArr[i2].setTextColor(mo3698s0().getColor(R.color.gray));
                            this.f34664l0[i2].setBackground(mo3698s0().getDrawable(R.drawable.volume_precent_shape));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: n3 */
    private void m45714n3() {
        this.f34658f0.setOnChangeListener(new C8279a());
        C8263j jVar = new C8263j(this);
        this.f34660h0.setOnClickListener(jVar);
        this.f34661i0.setOnClickListener(jVar);
        this.f34662j0.setOnClickListener(jVar);
        this.f34663k0.setOnClickListener(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public void m45715o3(boolean z) {
        if (!z) {
            m45711k3((float) ((C8287e.m45784H() * 100) / C8287e.m45786I()));
        } else if (this.f34658f0.getDegree() > 180.0f) {
            m45711k3(100.0f);
        } else {
            m45711k3((float) ((C8287e.m45784H() * 100) / C8287e.m45786I()));
        }
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        if (this.f34665m0 != null) {
            mo3606L().unregisterReceiver(this.f34665m0);
            this.f34665m0 = null;
        }
        DropVisualizerView dropVisualizerView = this.f34656d0;
        if (dropVisualizerView != null) {
            dropVisualizerView.mo10581s();
            this.f34656d0 = null;
        }
    }

    /* renamed from: L1 */
    public void mo3608L1() {
        super.mo3608L1();
        C8287e.m45813V0(false);
        m45712l3();
    }

    /* renamed from: Q1 */
    public void mo3623Q1() {
        super.mo3623Q1();
        C8287e.m45813V0(true);
        m45712l3();
    }

    /* renamed from: Q2 */
    public void mo3624Q2(boolean z) {
        super.mo3624Q2(z);
        C8287e.m45813V0(z);
        m45712l3();
        try {
            C7367a B = C8287e.m45772B();
            DropVisualizerView dropVisualizerView = this.f34656d0;
            if (dropVisualizerView != null && B != null) {
                if (z) {
                    dropVisualizerView.mo10580r(B.mo28126e(), C8287e.m45812V());
                } else {
                    dropVisualizerView.mo10581s();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_volume_booster, (ViewGroup) null);
        m45707f3(inflate);
        m45705d3();
        m45714n3();
        m45706e3();
        return inflate;
    }

    /* renamed from: g.a.a.f.e.d.q$b */
    /* compiled from: TabVolumeBoosterFragment */
    private class C8280b extends BroadcastReceiver {

        /* renamed from: a */
        private float f34670a;

        /* renamed from: b */
        private float f34671b;

        /* renamed from: c */
        private float f34672c;

        private C8280b() {
            this.f34670a = 20.0f;
            this.f34671b = 180.0f;
            this.f34672c = 180.0f + 20.0f;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo29979b(float f) {
            C8278q.this.f34658f0.setDegree(f);
            C8278q.this.f34657e0.setDegree(f);
            C8278q.this.f34658f0.postInvalidate();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo29980d() {
            float f;
            int i = 0;
            while (true) {
                float f2 = (float) i;
                if (f2 < 2.0f) {
                    SystemClock.sleep(50);
                    if (f2 < 1.0f) {
                        f = this.f34672c;
                    } else {
                        f = this.f34671b;
                    }
                    C8345u.m46339t(new C8265l(this, f));
                    i++;
                } else {
                    return;
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("media.musicplayer.audioplayer.videoplayer.volume_down")) {
                C8278q.this.m45715o3(true);
                this.f34671b = 180.0f;
                this.f34672c = 180.0f + this.f34670a;
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.volume_up")) {
                C8278q.this.m45715o3(false);
                this.f34671b = 180.0f;
                this.f34672c = 180.0f + this.f34670a;
            } else if (action.equals("media.musicplayer.audioplayer.videoplayer.max_system_volume")) {
                int d = C8284c.m45741d(C8345u.m46327h());
                if (d > 0) {
                    this.f34671b = ((float) (((d * 2) * 304) / C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION)) + 28.0f;
                } else {
                    this.f34671b = 180.0f;
                }
                this.f34672c = this.f34671b + this.f34670a;
                new Thread(new C8264k(this)).start();
            } else if (!action.equals("media.musicplayer.audioplayer.videoplayer.music_state_change")) {
                action.equals("media.musicplayer.audioplayer.videoplayer.audio_permission_change");
            }
        }

        /* synthetic */ C8280b(C8278q qVar, C8279a aVar) {
            this();
        }
    }
}
