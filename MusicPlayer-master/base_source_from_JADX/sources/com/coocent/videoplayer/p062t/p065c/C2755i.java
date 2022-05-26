package com.coocent.videoplayer.p062t.p065c;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0584b;
import androidx.recyclerview.widget.C0875i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.videoplayer.C2699h;
import com.coocent.videoplayer.C2702i;
import com.coocent.videoplayer.C2704k;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import com.coocent.videoplayer.p060r.C2715e;
import com.coocent.videoplayer.p061s.C2722b;
import com.coocent.videoplayer.p062t.p064b.C2741a;
import com.coocent.videoplayer.weidget.view.seekbar.VerticalSeekBar;
import com.un4seen.bass.BASS;
import java.util.List;
import java.util.Objects;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.t.c.i */
/* compiled from: EqualizerDialog.kt */
public final class C2755i extends C0584b implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: v0 */
    public static final C2756a f9440v0 = new C2756a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public static final String f9441w0 = C2755i.class.getCanonicalName();

    /* renamed from: q0 */
    private C2715e f9442q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C2759d f9443r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public SharedPreferences f9444s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public PopupWindow f9445t0;

    /* renamed from: u0 */
    private boolean f9446u0;

    /* renamed from: com.coocent.videoplayer.t.c.i$a */
    /* compiled from: EqualizerDialog.kt */
    public static final class C2756a {
        private C2756a() {
        }

        public /* synthetic */ C2756a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo10329a() {
            return C2755i.f9441w0;
        }

        /* renamed from: b */
        public final C2755i mo10330b(boolean z) {
            C2755i iVar = new C2755i();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_fullscreen", z);
            iVar.mo3581C2(bundle);
            return iVar;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.i$b */
    /* compiled from: EqualizerDialog.kt */
    public interface C2757b {
        /* renamed from: B */
        void mo10190B(short s);

        /* renamed from: K */
        void mo10191K(short s);

        /* renamed from: b0 */
        void mo10195b0(boolean z);

        /* renamed from: c1 */
        void mo10196c1(short s, short s2);

        /* renamed from: y0 */
        void mo10201y0(short s);
    }

    /* renamed from: com.coocent.videoplayer.t.c.i$c */
    /* compiled from: EqualizerDialog.kt */
    public interface C2758c {
        /* renamed from: a */
        void mo10331a(int i);
    }

    /* renamed from: com.coocent.videoplayer.t.c.i$d */
    /* compiled from: EqualizerDialog.kt */
    public final class C2759d extends RecyclerView.C0797h<C2760a> {

        /* renamed from: a */
        private final Context f9447a;

        /* renamed from: b */
        private final List<String> f9448b;

        /* renamed from: c */
        private final List<String> f9449c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f9450d;

        /* renamed from: e */
        private boolean f9451e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2758c f9452f;

        /* renamed from: g */
        final /* synthetic */ C2755i f9453g;

        /* renamed from: com.coocent.videoplayer.t.c.i$d$a */
        /* compiled from: EqualizerDialog.kt */
        public final class C2760a extends RecyclerView.C0792c0 implements View.OnClickListener {

            /* renamed from: g */
            private final AppCompatCheckedTextView f9454g;

            /* renamed from: h */
            final /* synthetic */ C2759d f9455h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2760a(C2759d dVar, View view) {
                super(view);
                C8594l.m46771e(dVar, "this$0");
                C8594l.m46771e(view, "itemView");
                this.f9455h = dVar;
                View findViewById = view.findViewById(C2706m.tv_preset);
                C8594l.m46770d(findViewById, "itemView.findViewById(R.id.tv_preset)");
                this.f9454g = (AppCompatCheckedTextView) findViewById;
                view.setOnClickListener(this);
            }

            /* renamed from: a */
            public final AppCompatCheckedTextView mo10340a() {
                return this.f9454g;
            }

            public void onClick(View view) {
                C8594l.m46771e(view, "view");
                C2758c c = this.f9455h.f9452f;
                if (c != null) {
                    C2759d dVar = this.f9455h;
                    C2755i iVar = dVar.f9453g;
                    int d = dVar.f9450d;
                    dVar.f9450d = getAbsoluteAdapterPosition();
                    dVar.notifyItemChanged(d);
                    dVar.notifyItemChanged(dVar.f9450d);
                    c.mo10331a(getAbsoluteAdapterPosition());
                    SharedPreferences k3 = iVar.f9444s0;
                    if (k3 != null) {
                        k3.edit().putString("video_preset_value", dVar.mo10332f()).apply();
                    } else {
                        C8594l.m46783q("mSharedPreferences");
                        throw null;
                    }
                }
            }
        }

        public C2759d(C2755i iVar, Context context) {
            C8594l.m46771e(iVar, "this$0");
            C8594l.m46771e(context, "mContext");
            this.f9453g = iVar;
            this.f9447a = context;
            String[] stringArray = context.getResources().getStringArray(C2702i.video_eq_name);
            C8594l.m46770d(stringArray, "mContext.resources.getSt…ay(R.array.video_eq_name)");
            this.f9448b = C8477h.m46635t(stringArray);
            String[] stringArray2 = context.getResources().getStringArray(C2702i.video_eq_value);
            C8594l.m46770d(stringArray2, "mContext.resources.getSt…y(R.array.video_eq_value)");
            List<String> v = C8477h.m46637v(stringArray2);
            this.f9449c = v;
            SharedPreferences k3 = iVar.f9444s0;
            if (k3 != null) {
                String string = k3.getString("video_preset_value", "3, 0, 0, 0, 3");
                SharedPreferences k32 = iVar.f9444s0;
                if (k32 != null) {
                    v.set(0, k32.getString("video_preset_custom_value", "0, 0, 0, 0, 0"));
                    this.f9450d = v.indexOf(string);
                    return;
                }
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
            C8594l.m46783q("mSharedPreferences");
            throw null;
        }

        /* renamed from: f */
        public final String mo10332f() {
            String str = this.f9449c.get(this.f9450d);
            C8594l.m46769c(str);
            return str;
        }

        /* renamed from: g */
        public final String mo10333g(int i) {
            String str = this.f9449c.get(i);
            C8594l.m46769c(str);
            return str;
        }

        public int getItemCount() {
            return this.f9448b.size();
        }

        /* renamed from: h */
        public void onBindViewHolder(C2760a aVar, int i) {
            C8594l.m46771e(aVar, "holder");
            String str = this.f9448b.get(i);
            if (!TextUtils.isEmpty(str)) {
                aVar.mo10340a().setText(str);
                aVar.mo10340a().setChecked(this.f9450d == i);
                aVar.mo10340a().setEnabled(this.f9451e);
                aVar.itemView.setEnabled(this.f9451e);
            }
        }

        /* renamed from: i */
        public C2760a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C8594l.m46771e(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f9447a).inflate(C2707n.video_layout_item_eq_preset, viewGroup, false);
            C8594l.m46770d(inflate, "view");
            return new C2760a(this, inflate);
        }

        /* renamed from: j */
        public final void mo10336j() {
            int i = this.f9450d;
            if (i != 0) {
                this.f9450d = 0;
                notifyItemChanged(i);
                notifyItemChanged(this.f9450d);
            }
        }

        /* renamed from: k */
        public final void mo10337k(boolean z) {
            this.f9451e = z;
            notifyItemRangeChanged(0, getItemCount());
        }

        /* renamed from: l */
        public final void mo10338l(C2758c cVar) {
            C8594l.m46771e(cVar, "onPresetClickListener");
            this.f9452f = cVar;
        }

        /* renamed from: m */
        public final void mo10339m(String str, int i) {
            C8594l.m46771e(str, "value");
            this.f9449c.set(i, str);
            notifyItemChanged(i);
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.i$e */
    /* compiled from: EqualizerDialog.kt */
    public static final class C2761e implements C2758c {

        /* renamed from: a */
        final /* synthetic */ C2755i f9456a;

        /* renamed from: b */
        final /* synthetic */ VerticalSeekBar[] f9457b;

        C2761e(C2755i iVar, VerticalSeekBar[] verticalSeekBarArr) {
            this.f9456a = iVar;
            this.f9457b = verticalSeekBarArr;
        }

        /* renamed from: a */
        public void mo10331a(int i) {
            C2759d i3 = this.f9456a.f9443r0;
            if (i3 != null) {
                String[] split = TextUtils.split(i3.mo10333g(i), ", ");
                C2755i iVar = this.f9456a;
                C8594l.m46770d(split, "value");
                iVar.m12450v3(split, this.f9457b);
                return;
            }
            C8594l.m46783q("mPresetAdapter");
            throw null;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.i$f */
    /* compiled from: EqualizerDialog.kt */
    public static final class C2762f implements C2699h.C2700a {

        /* renamed from: a */
        final /* synthetic */ C2755i f9458a;

        /* renamed from: b */
        final /* synthetic */ C2699h f9459b;

        /* renamed from: c */
        final /* synthetic */ AppCompatTextView f9460c;

        C2762f(C2755i iVar, C2699h hVar, AppCompatTextView appCompatTextView) {
            this.f9458a = iVar;
            this.f9459b = hVar;
            this.f9460c = appCompatTextView;
        }

        /* renamed from: a */
        public void mo10251a(int i) {
            if (this.f9458a.mo3705u2() instanceof C2757b) {
                ((C2757b) this.f9458a.mo3705u2()).mo10190B((short) this.f9459b.mo10247e(i));
            }
            this.f9460c.setText(this.f9459b.mo10246d(i));
            PopupWindow j3 = this.f9458a.f9445t0;
            if (j3 != null) {
                j3.dismiss();
            }
            SharedPreferences k3 = this.f9458a.f9444s0;
            if (k3 != null) {
                k3.edit().putInt("video_reverb_value", this.f9459b.mo10247e(i)).apply();
            } else {
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m12445q3(C2755i iVar) {
        C8594l.m46771e(iVar, "this$0");
        C2715e eVar = iVar.f9442q0;
        if (eVar != null) {
            eVar.f9320b.mo4702y1(0);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m12446r3(C2755i iVar, View[] viewArr, CompoundButton compoundButton, boolean z) {
        C8594l.m46771e(iVar, "this$0");
        C8594l.m46771e(viewArr, "$views");
        C2759d dVar = iVar.f9443r0;
        if (dVar != null) {
            dVar.mo10337k(z);
            iVar.m12448t3(viewArr, z);
            ((C2757b) iVar.mo3705u2()).mo10195b0(z);
            SharedPreferences sharedPreferences = iVar.f9444s0;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean("video_eq_enabled", z).apply();
            } else {
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
        } else {
            C8594l.m46783q("mPresetAdapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m12447s3(C2755i iVar, View view) {
        C8594l.m46771e(iVar, "this$0");
        PopupWindow popupWindow = iVar.f9445t0;
        if (popupWindow != null) {
            C8594l.m46769c(popupWindow);
            if (popupWindow.isShowing()) {
                PopupWindow popupWindow2 = iVar.f9445t0;
                C8594l.m46769c(popupWindow2);
                popupWindow2.dismiss();
                return;
            }
        }
        C2715e eVar = iVar.f9442q0;
        if (eVar != null) {
            AppCompatTextView appCompatTextView = eVar.f9329k;
            C8594l.m46770d(appCompatTextView, "mBinding.tvReverb");
            iVar.m12451w3(appCompatTextView);
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: t3 */
    private final void m12448t3(View[] viewArr, boolean z) {
        int length = viewArr.length;
        int i = 0;
        while (i < length) {
            View view = viewArr[i];
            i++;
            view.setEnabled(z);
        }
    }

    /* renamed from: u3 */
    private final void m12449u3(AppCompatSeekBar[] appCompatSeekBarArr, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        int length = appCompatSeekBarArr.length;
        int i = 0;
        while (i < length) {
            AppCompatSeekBar appCompatSeekBar = appCompatSeekBarArr[i];
            i++;
            appCompatSeekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m12450v3(String[] strArr, VerticalSeekBar[] verticalSeekBarArr) {
        int length = verticalSeekBarArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int parseInt = Integer.parseInt(strArr[i]) + 15;
                if (verticalSeekBarArr[i].getProgress() != parseInt) {
                    verticalSeekBarArr[i].setProgress(parseInt);
                }
                if (i2 <= length) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w3 */
    private final void m12451w3(AppCompatTextView appCompatTextView) {
        if (this.f9445t0 == null) {
            View inflate = LayoutInflater.from(mo3708v2()).inflate(C2707n.video_layout_drop_down_menu, (ViewGroup) null);
            C8594l.m46770d(inflate, "from(requireContext())\n …out_drop_down_menu, null)");
            inflate.measure(0, 0);
            View findViewById = inflate.findViewById(C2706m.rv_drop_down);
            C8594l.m46770d(findViewById, "popupView.findViewById(R.id.rv_drop_down)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(mo3708v2(), 1, false));
            recyclerView.mo4622h(new C0875i(mo3708v2(), 1));
            Context v2 = mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            C2699h hVar = new C2699h(v2);
            recyclerView.setAdapter(hVar);
            hVar.mo10250h(new C2762f(this, hVar, appCompatTextView));
            PopupWindow popupWindow = new PopupWindow();
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setAnimationStyle(16973827);
            C8457t tVar = C8457t.f34900a;
            this.f9445t0 = popupWindow;
        }
        if (Build.VERSION.SDK_INT < 19) {
            PopupWindow popupWindow2 = this.f9445t0;
            C8594l.m46769c(popupWindow2);
            popupWindow2.showAsDropDown(appCompatTextView, 0, 0);
            return;
        }
        PopupWindow popupWindow3 = this.f9445t0;
        C8594l.m46769c(popupWindow3);
        Context v22 = mo3708v2();
        C8594l.m46770d(v22, "requireContext()");
        popupWindow3.showAsDropDown(appCompatTextView, 0, 0, C2722b.m12313a(v22) ? 8388613 : 8388611);
    }

    /* renamed from: L1 */
    public void mo3608L1() {
        super.mo3608L1();
        mo3831X2();
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        Window window;
        int i;
        float f;
        super.mo3630S1();
        Dialog a3 = mo3834a3();
        if (a3 != null && (window = a3.getWindow()) != null) {
            DisplayMetrics displayMetrics = mo3698s0().getDisplayMetrics();
            if (this.f9446u0) {
                i = (int) (((float) displayMetrics.widthPixels) * 0.6f);
                f = ((float) displayMetrics.heightPixels) * 0.9f;
            } else {
                i = (int) (((float) displayMetrics.widthPixels) * 0.9f);
                f = ((float) displayMetrics.heightPixels) * 0.6f;
            }
            window.setLayout(i, (int) f);
            window.setGravity(17);
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        SharedPreferences sharedPreferences = mo3708v2().getSharedPreferences("video_eq_config", 0);
        C8594l.m46770d(sharedPreferences, "requireContext().getShar…ME, Context.MODE_PRIVATE)");
        this.f9444s0 = sharedPreferences;
        VerticalSeekBar[] verticalSeekBarArr = new VerticalSeekBar[5];
        C2715e eVar = this.f9442q0;
        if (eVar != null) {
            verticalSeekBarArr[0] = eVar.f9325g;
            if (eVar != null) {
                verticalSeekBarArr[1] = eVar.f9323e;
                if (eVar != null) {
                    verticalSeekBarArr[2] = eVar.f9321c;
                    if (eVar != null) {
                        verticalSeekBarArr[3] = eVar.f9324f;
                        if (eVar != null) {
                            verticalSeekBarArr[4] = eVar.f9322d;
                            if (sharedPreferences != null) {
                                boolean z = sharedPreferences.getBoolean("video_eq_enabled", false);
                                C2715e eVar2 = this.f9442q0;
                                if (eVar2 != null) {
                                    eVar2.f9328j.setChecked(z);
                                    C2715e eVar3 = this.f9442q0;
                                    if (eVar3 != null) {
                                        eVar3.f9320b.setHasFixedSize(true);
                                        C2715e eVar4 = this.f9442q0;
                                        if (eVar4 != null) {
                                            eVar4.f9320b.setLayoutManager(new LinearLayoutManager(mo3708v2(), 0, false));
                                            C2715e eVar5 = this.f9442q0;
                                            if (eVar5 != null) {
                                                eVar5.f9320b.mo4622h(new C2741a(mo3698s0().getDimensionPixelOffset(C2704k.video_recycler_view_default_spacing)));
                                                Context v2 = mo3708v2();
                                                C8594l.m46770d(v2, "requireContext()");
                                                C2759d dVar = new C2759d(this, v2);
                                                this.f9443r0 = dVar;
                                                C2715e eVar6 = this.f9442q0;
                                                if (eVar6 != null) {
                                                    RecyclerView recyclerView = eVar6.f9320b;
                                                    if (dVar != null) {
                                                        recyclerView.setAdapter(dVar);
                                                        C2759d dVar2 = this.f9443r0;
                                                        if (dVar2 != null) {
                                                            dVar2.mo10337k(z);
                                                            C2759d dVar3 = this.f9443r0;
                                                            if (dVar3 != null) {
                                                                dVar3.mo10338l(new C2761e(this, verticalSeekBarArr));
                                                                C2715e eVar7 = this.f9442q0;
                                                                if (eVar7 != null) {
                                                                    AppCompatSeekBar appCompatSeekBar = eVar7.f9326h;
                                                                    SharedPreferences sharedPreferences2 = this.f9444s0;
                                                                    if (sharedPreferences2 != null) {
                                                                        appCompatSeekBar.setProgress(sharedPreferences2.getInt("video_bass_boost_value", BASS.BASS_ERROR_JAVA_CLASS));
                                                                        C2715e eVar8 = this.f9442q0;
                                                                        if (eVar8 != null) {
                                                                            AppCompatSeekBar appCompatSeekBar2 = eVar8.f9327i;
                                                                            SharedPreferences sharedPreferences3 = this.f9444s0;
                                                                            if (sharedPreferences3 != null) {
                                                                                appCompatSeekBar2.setProgress(sharedPreferences3.getInt("video_virtualizer_value", BASS.BASS_ERROR_JAVA_CLASS));
                                                                                C2759d dVar4 = this.f9443r0;
                                                                                if (dVar4 != null) {
                                                                                    String[] split = TextUtils.split(dVar4.mo10332f(), ", ");
                                                                                    C8594l.m46770d(split, "presetValue");
                                                                                    m12450v3(split, verticalSeekBarArr);
                                                                                    SharedPreferences sharedPreferences4 = this.f9444s0;
                                                                                    if (sharedPreferences4 != null) {
                                                                                        int i = sharedPreferences4.getInt("video_reverb_value", 0);
                                                                                        String[] stringArray = mo3698s0().getStringArray(C2702i.video_eq_room);
                                                                                        C8594l.m46770d(stringArray, "resources.getStringArray(R.array.video_eq_room)");
                                                                                        C2715e eVar9 = this.f9442q0;
                                                                                        if (eVar9 != null) {
                                                                                            eVar9.f9329k.setText(stringArray[i]);
                                                                                            View[] viewArr = new View[8];
                                                                                            C2715e eVar10 = this.f9442q0;
                                                                                            if (eVar10 != null) {
                                                                                                AppCompatTextView appCompatTextView = eVar10.f9329k;
                                                                                                C8594l.m46770d(appCompatTextView, "mBinding.tvReverb");
                                                                                                viewArr[0] = appCompatTextView;
                                                                                                C2715e eVar11 = this.f9442q0;
                                                                                                if (eVar11 != null) {
                                                                                                    VerticalSeekBar verticalSeekBar = eVar11.f9325g;
                                                                                                    C8594l.m46770d(verticalSeekBar, "mBinding.sb75");
                                                                                                    viewArr[1] = verticalSeekBar;
                                                                                                    C2715e eVar12 = this.f9442q0;
                                                                                                    if (eVar12 != null) {
                                                                                                        VerticalSeekBar verticalSeekBar2 = eVar12.f9323e;
                                                                                                        C8594l.m46770d(verticalSeekBar2, "mBinding.sb290");
                                                                                                        viewArr[2] = verticalSeekBar2;
                                                                                                        C2715e eVar13 = this.f9442q0;
                                                                                                        if (eVar13 != null) {
                                                                                                            VerticalSeekBar verticalSeekBar3 = eVar13.f9321c;
                                                                                                            C8594l.m46770d(verticalSeekBar3, "mBinding.sb1130");
                                                                                                            viewArr[3] = verticalSeekBar3;
                                                                                                            C2715e eVar14 = this.f9442q0;
                                                                                                            if (eVar14 != null) {
                                                                                                                VerticalSeekBar verticalSeekBar4 = eVar14.f9324f;
                                                                                                                C8594l.m46770d(verticalSeekBar4, "mBinding.sb4400");
                                                                                                                viewArr[4] = verticalSeekBar4;
                                                                                                                C2715e eVar15 = this.f9442q0;
                                                                                                                if (eVar15 != null) {
                                                                                                                    VerticalSeekBar verticalSeekBar5 = eVar15.f9322d;
                                                                                                                    C8594l.m46770d(verticalSeekBar5, "mBinding.sb13500");
                                                                                                                    viewArr[5] = verticalSeekBar5;
                                                                                                                    C2715e eVar16 = this.f9442q0;
                                                                                                                    if (eVar16 != null) {
                                                                                                                        AppCompatSeekBar appCompatSeekBar3 = eVar16.f9326h;
                                                                                                                        C8594l.m46770d(appCompatSeekBar3, "mBinding.sbBassBoost");
                                                                                                                        viewArr[6] = appCompatSeekBar3;
                                                                                                                        C2715e eVar17 = this.f9442q0;
                                                                                                                        if (eVar17 != null) {
                                                                                                                            AppCompatSeekBar appCompatSeekBar4 = eVar17.f9327i;
                                                                                                                            C8594l.m46770d(appCompatSeekBar4, "mBinding.sbVirtualizer");
                                                                                                                            viewArr[7] = appCompatSeekBar4;
                                                                                                                            m12448t3(viewArr, z);
                                                                                                                            C2715e eVar18 = this.f9442q0;
                                                                                                                            if (eVar18 != null) {
                                                                                                                                eVar18.f9328j.setOnCheckedChangeListener(new C2744c(this, viewArr));
                                                                                                                                AppCompatSeekBar[] appCompatSeekBarArr = new AppCompatSeekBar[7];
                                                                                                                                C2715e eVar19 = this.f9442q0;
                                                                                                                                if (eVar19 != null) {
                                                                                                                                    VerticalSeekBar verticalSeekBar6 = eVar19.f9325g;
                                                                                                                                    C8594l.m46770d(verticalSeekBar6, "mBinding.sb75");
                                                                                                                                    appCompatSeekBarArr[0] = verticalSeekBar6;
                                                                                                                                    C2715e eVar20 = this.f9442q0;
                                                                                                                                    if (eVar20 != null) {
                                                                                                                                        VerticalSeekBar verticalSeekBar7 = eVar20.f9323e;
                                                                                                                                        C8594l.m46770d(verticalSeekBar7, "mBinding.sb290");
                                                                                                                                        appCompatSeekBarArr[1] = verticalSeekBar7;
                                                                                                                                        C2715e eVar21 = this.f9442q0;
                                                                                                                                        if (eVar21 != null) {
                                                                                                                                            VerticalSeekBar verticalSeekBar8 = eVar21.f9321c;
                                                                                                                                            C8594l.m46770d(verticalSeekBar8, "mBinding.sb1130");
                                                                                                                                            appCompatSeekBarArr[2] = verticalSeekBar8;
                                                                                                                                            C2715e eVar22 = this.f9442q0;
                                                                                                                                            if (eVar22 != null) {
                                                                                                                                                VerticalSeekBar verticalSeekBar9 = eVar22.f9324f;
                                                                                                                                                C8594l.m46770d(verticalSeekBar9, "mBinding.sb4400");
                                                                                                                                                appCompatSeekBarArr[3] = verticalSeekBar9;
                                                                                                                                                C2715e eVar23 = this.f9442q0;
                                                                                                                                                if (eVar23 != null) {
                                                                                                                                                    VerticalSeekBar verticalSeekBar10 = eVar23.f9322d;
                                                                                                                                                    C8594l.m46770d(verticalSeekBar10, "mBinding.sb13500");
                                                                                                                                                    appCompatSeekBarArr[4] = verticalSeekBar10;
                                                                                                                                                    C2715e eVar24 = this.f9442q0;
                                                                                                                                                    if (eVar24 != null) {
                                                                                                                                                        AppCompatSeekBar appCompatSeekBar5 = eVar24.f9326h;
                                                                                                                                                        C8594l.m46770d(appCompatSeekBar5, "mBinding.sbBassBoost");
                                                                                                                                                        appCompatSeekBarArr[5] = appCompatSeekBar5;
                                                                                                                                                        C2715e eVar25 = this.f9442q0;
                                                                                                                                                        if (eVar25 != null) {
                                                                                                                                                            AppCompatSeekBar appCompatSeekBar6 = eVar25.f9327i;
                                                                                                                                                            C8594l.m46770d(appCompatSeekBar6, "mBinding.sbVirtualizer");
                                                                                                                                                            appCompatSeekBarArr[6] = appCompatSeekBar6;
                                                                                                                                                            m12449u3(appCompatSeekBarArr, this);
                                                                                                                                                            C2715e eVar26 = this.f9442q0;
                                                                                                                                                            if (eVar26 != null) {
                                                                                                                                                                eVar26.f9329k.setOnClickListener(new C2745d(this));
                                                                                                                                                            } else {
                                                                                                                                                                C8594l.m46783q("mBinding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            C8594l.m46783q("mBinding");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        C8594l.m46783q("mBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    C8594l.m46783q("mBinding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                C8594l.m46783q("mBinding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            C8594l.m46783q("mBinding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        C8594l.m46783q("mBinding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    C8594l.m46783q("mBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                C8594l.m46783q("mBinding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            C8594l.m46783q("mBinding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        C8594l.m46783q("mBinding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    C8594l.m46783q("mBinding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                C8594l.m46783q("mBinding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            C8594l.m46783q("mBinding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        C8594l.m46783q("mBinding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    C8594l.m46783q("mBinding");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C8594l.m46783q("mBinding");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C8594l.m46783q("mBinding");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C8594l.m46783q("mSharedPreferences");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    C8594l.m46783q("mPresetAdapter");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                C8594l.m46783q("mSharedPreferences");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            C8594l.m46783q("mBinding");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C8594l.m46783q("mSharedPreferences");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C8594l.m46783q("mBinding");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C8594l.m46783q("mPresetAdapter");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C8594l.m46783q("mPresetAdapter");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C8594l.m46783q("mPresetAdapter");
                                                        throw null;
                                                    }
                                                } else {
                                                    C8594l.m46783q("mBinding");
                                                    throw null;
                                                }
                                            } else {
                                                C8594l.m46783q("mBinding");
                                                throw null;
                                            }
                                        } else {
                                            C8594l.m46783q("mBinding");
                                            throw null;
                                        }
                                    } else {
                                        C8594l.m46783q("mBinding");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("mBinding");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("mSharedPreferences");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        Bundle V = mo3638V();
        if (V != null) {
            this.f9446u0 = V.getBoolean("is_fullscreen", false);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C8594l.m46771e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo3832Y2();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C8594l.m46771e(seekBar, "seekbar");
        int id = seekBar.getId();
        boolean z2 = false;
        if ((((id == C2706m.sb_75 || id == C2706m.sb_290) || id == C2706m.sb_1130) || id == C2706m.sb_4400) || id == C2706m.sb_13500) {
            z2 = true;
        }
        if (z2) {
            Object tag = seekBar.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.String");
            ((C2757b) mo3705u2()).mo10196c1(Short.parseShort((String) tag), (short) ((i - 15) * 100));
        } else if (id == C2706m.sb_bass_boost) {
            ((C2757b) mo3705u2()).mo10191K((short) seekBar.getProgress());
        } else if (id == C2706m.sb_virtualizer) {
            ((C2757b) mo3705u2()).mo10201y0((short) seekBar.getProgress());
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C8594l.m46771e(seekBar, "seekBar");
        int id = seekBar.getId();
        if ((id == C2706m.sb_75 || id == C2706m.sb_290 || id == C2706m.sb_1130 || id == C2706m.sb_4400 || id == C2706m.sb_13500) && (seekBar instanceof VerticalSeekBar) && ((VerticalSeekBar) seekBar).getFromUser()) {
            C2759d dVar = this.f9443r0;
            if (dVar != null) {
                dVar.mo10336j();
                C2715e eVar = this.f9442q0;
                if (eVar != null) {
                    eVar.f9320b.post(new C2746e(this));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mPresetAdapter");
                throw null;
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C8594l.m46771e(seekBar, "seekBar");
        int id = seekBar.getId();
        if (id == C2706m.sb_75 || id == C2706m.sb_290 || id == C2706m.sb_1130 || id == C2706m.sb_4400 || id == C2706m.sb_13500) {
            StringBuilder sb = new StringBuilder();
            C2715e eVar = this.f9442q0;
            if (eVar != null) {
                sb.append(eVar.f9325g.getProgress() - 15);
                sb.append(", ");
                C2715e eVar2 = this.f9442q0;
                if (eVar2 != null) {
                    sb.append(eVar2.f9323e.getProgress() - 15);
                    sb.append(", ");
                    C2715e eVar3 = this.f9442q0;
                    if (eVar3 != null) {
                        sb.append(eVar3.f9321c.getProgress() - 15);
                        sb.append(", ");
                        C2715e eVar4 = this.f9442q0;
                        if (eVar4 != null) {
                            sb.append(eVar4.f9324f.getProgress() - 15);
                            sb.append(", ");
                            C2715e eVar5 = this.f9442q0;
                            if (eVar5 != null) {
                                sb.append(eVar5.f9322d.getProgress() - 15);
                                String sb2 = sb.toString();
                                C2759d dVar = this.f9443r0;
                                if (dVar != null) {
                                    dVar.mo10339m(sb2, 0);
                                    SharedPreferences sharedPreferences = this.f9444s0;
                                    if (sharedPreferences != null) {
                                        SharedPreferences.Editor edit = sharedPreferences.edit();
                                        edit.putString("video_preset_value", sb2);
                                        edit.putString("video_preset_custom_value", sb2);
                                        edit.apply();
                                        return;
                                    }
                                    C8594l.m46783q("mSharedPreferences");
                                    throw null;
                                }
                                C8594l.m46783q("mPresetAdapter");
                                throw null;
                            }
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            C8594l.m46783q("mBinding");
            throw null;
        } else if (id == C2706m.sb_bass_boost) {
            SharedPreferences sharedPreferences2 = this.f9444s0;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putInt("video_bass_boost_value", seekBar.getProgress()).apply();
            } else {
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
        } else if (id == C2706m.sb_virtualizer) {
            SharedPreferences sharedPreferences3 = this.f9444s0;
            if (sharedPreferences3 != null) {
                sharedPreferences3.edit().putInt("video_virtualizer_value", seekBar.getProgress()).apply();
            } else {
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C8594l.m46771e(layoutInflater, "inflater");
        Dialog a3 = mo3834a3();
        if (a3 != null) {
            a3.setCanceledOnTouchOutside(true);
            if (Build.VERSION.SDK_INT >= 21 && (window = a3.getWindow()) != null) {
                window.addFlags(Integer.MIN_VALUE);
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
        C2715e d = C2715e.m12288d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "this");
        this.f9442q0 = d;
        ConstraintLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…ing = this\n        }.root");
        return c;
    }
}
