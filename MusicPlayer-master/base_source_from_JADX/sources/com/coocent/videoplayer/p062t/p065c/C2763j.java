package com.coocent.videoplayer.p062t.p065c;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
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
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0584b;
import com.akexorcist.snaptimepicker.C1698d;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.videoplayer.C2703j;
import com.coocent.videoplayer.C2705l;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2708o;
import com.coocent.videoplayer.C2709p;
import com.coocent.videoplayer.p060r.C2716f;
import com.coocent.videoplayer.weidget.view.ValueRadioButton;
import com.p256kk.taurus.playerbase.render.C6722a;
import java.util.Objects;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.t.c.j */
/* compiled from: MoreDialog.kt */
public final class C2763j extends C0584b implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: t0 */
    public static final C2764a f9461t0 = new C2764a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final String f9462u0 = C2763j.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C2716f f9463q0;

    /* renamed from: r0 */
    private C1698d f9464r0;

    /* renamed from: s0 */
    private boolean f9465s0;

    /* renamed from: com.coocent.videoplayer.t.c.j$a */
    /* compiled from: MoreDialog.kt */
    public static final class C2764a {
        private C2764a() {
        }

        public /* synthetic */ C2764a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo10344a() {
            return C2763j.f9462u0;
        }

        /* renamed from: b */
        public final C2763j mo10345b(boolean z) {
            C2763j jVar = new C2763j();
            Bundle bundle = new Bundle();
            bundle.putBoolean("landscape", z);
            C8457t tVar = C8457t.f34900a;
            jVar.mo3581C2(bundle);
            return jVar;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.j$b */
    /* compiled from: MoreDialog.kt */
    public interface C2765b {
        /* renamed from: X0 */
        void mo10194X0(float f);

        /* renamed from: i0 */
        void mo10197i0();

        /* renamed from: k0 */
        void mo10198k0(int i);

        /* renamed from: n0 */
        void mo10199n0(int i, long j);

        /* renamed from: w0 */
        void mo10200w0(C6722a aVar);
    }

    /* renamed from: com.coocent.videoplayer.t.c.j$c */
    /* compiled from: MoreDialog.kt */
    public /* synthetic */ class C2766c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9466a;

        static {
            int[] iArr = new int[C6722a.values().length];
            iArr[C6722a.AspectRatio_FILL_PARENT.ordinal()] = 1;
            iArr[C6722a.AspectRatio_MATCH_PARENT.ordinal()] = 2;
            iArr[C6722a.AspectRatio_ORIGIN.ordinal()] = 3;
            iArr[C6722a.AspectRatio_16_9.ordinal()] = 4;
            iArr[C6722a.AspectRatio_4_3.ordinal()] = 5;
            f9466a = iArr;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.j$d */
    /* compiled from: MoreDialog.kt */
    public static final class C2767d implements C1698d.C1701c {

        /* renamed from: a */
        final /* synthetic */ C2763j f9467a;

        /* renamed from: b */
        final /* synthetic */ C2765b f9468b;

        C2767d(C2763j jVar, C2765b bVar) {
            this.f9467a = jVar;
            this.f9468b = bVar;
        }

        /* renamed from: a */
        public void mo7556a(int i, int i2) {
            if (i == 0 && i2 == 0) {
                C2716f i3 = this.f9467a.f9463q0;
                if (i3 != null) {
                    i3.f9333d.setChecked(true);
                    C2765b bVar = this.f9468b;
                    C2716f i32 = this.f9467a.f9463q0;
                    if (i32 != null) {
                        String value = i32.f9333d.getValue();
                        C8594l.m46770d(value, "mBinding.rbSleepOff.value");
                        bVar.mo10199n0(Integer.parseInt(value), 0);
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            long j = (((long) (i * 60 * 60)) * 1000) + (((long) (i2 * 60)) * 1000);
            C2765b bVar2 = this.f9468b;
            C2716f i33 = this.f9467a.f9463q0;
            if (i33 != null) {
                String value2 = i33.f9332c.getValue();
                C8594l.m46770d(value2, "mBinding.rbSleepCustom.value");
                bVar2.mo10199n0(Integer.parseInt(value2), j);
                C2716f i34 = this.f9467a.f9463q0;
                if (i34 != null) {
                    i34.f9332c.setChecked(true);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m12482l3(C2763j jVar, View view) {
        C8594l.m46771e(jVar, "this$0");
        Dialog a3 = jVar.mo3834a3();
        if (a3 != null) {
            a3.hide();
        }
    }

    /* renamed from: L1 */
    public void mo3608L1() {
        super.mo3608L1();
        mo3831X2();
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        Window window;
        super.mo3630S1();
        Dialog a3 = mo3834a3();
        if (a3 != null && (window = a3.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            C8594l.m46770d(attributes, "it.attributes");
            attributes.dimAmount = 0.0f;
            DisplayMetrics displayMetrics = mo3698s0().getDisplayMetrics();
            if (!this.f9465s0) {
                window.setGravity(80);
                window.setLayout(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                window.setGravity(8388613);
                window.setLayout(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        int i;
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        int i2 = 0;
        if (this.f9465s0) {
            C2716f fVar = this.f9463q0;
            if (fVar != null) {
                fVar.mo7577a().setOrientation(0);
                C2716f fVar2 = this.f9463q0;
                if (fVar2 != null) {
                    fVar2.f9345p.setBackground(C0506a.m3152d(mo3708v2(), C2705l.video_drawable_dialog_linear_gradient_angle180));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C2716f fVar3 = this.f9463q0;
            if (fVar3 != null) {
                fVar3.mo7577a().setOrientation(1);
                C2716f fVar4 = this.f9463q0;
                if (fVar4 != null) {
                    fVar4.f9345p.setBackground(C0506a.m3152d(mo3708v2(), C2705l.video_drawable_dialog_linear_gradient_angle90));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
        int i3 = 8;
        if (Build.VERSION.SDK_INT < 23) {
            C2716f fVar5 = this.f9463q0;
            if (fVar5 != null) {
                RadioGroup radioGroup = fVar5.f9336g;
                C8594l.m46770d(radioGroup, "mBinding.rgPlaySpeed");
                radioGroup.setVisibility(8);
                C2716f fVar6 = this.f9463q0;
                if (fVar6 != null) {
                    AppCompatTextView appCompatTextView = fVar6.f9340k;
                    C8594l.m46770d(appCompatTextView, "mBinding.tvPlaySpeed");
                    appCompatTextView.setVisibility(8);
                    C2716f fVar7 = this.f9463q0;
                    if (fVar7 != null) {
                        View view2 = fVar7.f9342m;
                        C8594l.m46770d(view2, "mBinding.viewPlaySpeedSeparator");
                        view2.setVisibility(8);
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
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        Application application = mo3705u2().getApplication();
        C8594l.m46770d(application, "requireActivity().application");
        PlayerHelper instance = companion.getInstance(application);
        int i4 = C2766c.f9466a[instance.getAspectRatio().ordinal()];
        if (i4 == 1) {
            i = C2706m.rb_ratio_fill;
        } else if (i4 == 2) {
            i = C2706m.rb_ratio_match;
        } else if (i4 == 3) {
            i = C2706m.rb_ratio_origin;
        } else if (i4 == 4) {
            i = C2706m.rb_ratio_16_9;
        } else if (i4 != 5) {
            i = C2706m.rb_ratio_fit;
        } else {
            i = C2706m.rb_ratio_4_3;
        }
        C2716f fVar8 = this.f9463q0;
        if (fVar8 != null) {
            fVar8.f9337h.check(i);
            C2716f fVar9 = this.f9463q0;
            if (fVar9 != null) {
                RadioGroup radioGroup2 = fVar9.f9334e;
                C8594l.m46770d(radioGroup2, "mBinding.rgAudioMode");
                radioGroup2.setVisibility(instance.showAudioBtn() ? 0 : 8);
                C2716f fVar10 = this.f9463q0;
                if (fVar10 != null) {
                    View view3 = fVar10.f9341l;
                    C8594l.m46770d(view3, "mBinding.viewAudioSeparator");
                    view3.setVisibility(instance.showAudioBtn() ? 0 : 8);
                    C2716f fVar11 = this.f9463q0;
                    if (fVar11 != null) {
                        View view4 = fVar11.f9344o;
                        C8594l.m46770d(view4, "mBinding.viewSleepSeparator");
                        view4.setVisibility(instance.isAppType() != 1 ? 0 : 8);
                        C2716f fVar12 = this.f9463q0;
                        if (fVar12 != null) {
                            AppCompatTextView appCompatTextView2 = fVar12.f9339j;
                            C8594l.m46770d(appCompatTextView2, "mBinding.tvPlayMode");
                            appCompatTextView2.setVisibility(instance.isAppType() != 1 ? 0 : 8);
                            C2716f fVar13 = this.f9463q0;
                            if (fVar13 != null) {
                                RadioGroup radioGroup3 = fVar13.f9335f;
                                C8594l.m46770d(radioGroup3, "mBinding.rgPlayMode");
                                if (instance.isAppType() != 1) {
                                    i3 = 0;
                                }
                                radioGroup3.setVisibility(i3);
                                C2716f fVar14 = this.f9463q0;
                                if (fVar14 != null) {
                                    int childCount = fVar14.f9336g.getChildCount();
                                    if (childCount > 0) {
                                        int i5 = 0;
                                        while (true) {
                                            int i6 = i5 + 1;
                                            C2716f fVar15 = this.f9463q0;
                                            if (fVar15 != null) {
                                                View childAt = fVar15.f9336g.getChildAt(i5);
                                                Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.coocent.videoplayer.weidget.view.ValueRadioButton");
                                                ValueRadioButton valueRadioButton = (ValueRadioButton) childAt;
                                                valueRadioButton.setChecked(TextUtils.equals(valueRadioButton.getText(), String.valueOf(instance.getSpeed())));
                                                if (i6 >= childCount) {
                                                    break;
                                                }
                                                i5 = i6;
                                            } else {
                                                C8594l.m46783q("mBinding");
                                                throw null;
                                            }
                                        }
                                    }
                                    C2716f fVar16 = this.f9463q0;
                                    if (fVar16 != null) {
                                        int childCount2 = fVar16.f9338i.getChildCount();
                                        if (childCount2 > 0) {
                                            int i7 = 0;
                                            while (true) {
                                                int i8 = i7 + 1;
                                                C2716f fVar17 = this.f9463q0;
                                                if (fVar17 != null) {
                                                    View childAt2 = fVar17.f9338i.getChildAt(i7);
                                                    Objects.requireNonNull(childAt2, "null cannot be cast to non-null type com.coocent.videoplayer.weidget.view.ValueRadioButton");
                                                    ValueRadioButton valueRadioButton2 = (ValueRadioButton) childAt2;
                                                    String value = valueRadioButton2.getValue();
                                                    C8594l.m46770d(value, "radioButton.value");
                                                    valueRadioButton2.setChecked(Integer.parseInt(value) == instance.getSleepMode());
                                                    if (i8 >= childCount2) {
                                                        break;
                                                    }
                                                    i7 = i8;
                                                } else {
                                                    C8594l.m46783q("mBinding");
                                                    throw null;
                                                }
                                            }
                                        }
                                        C2716f fVar18 = this.f9463q0;
                                        if (fVar18 != null) {
                                            int childCount3 = fVar18.f9335f.getChildCount();
                                            if (childCount3 > 0) {
                                                while (true) {
                                                    int i9 = i2 + 1;
                                                    C2716f fVar19 = this.f9463q0;
                                                    if (fVar19 != null) {
                                                        View childAt3 = fVar19.f9335f.getChildAt(i2);
                                                        Objects.requireNonNull(childAt3, "null cannot be cast to non-null type com.coocent.videoplayer.weidget.view.ValueRadioButton");
                                                        ValueRadioButton valueRadioButton3 = (ValueRadioButton) childAt3;
                                                        valueRadioButton3.setChecked(TextUtils.equals(valueRadioButton3.getValue(), String.valueOf(instance.getPlayMode())));
                                                        if (i9 >= childCount3) {
                                                            break;
                                                        }
                                                        i2 = i9;
                                                    } else {
                                                        C8594l.m46783q("mBinding");
                                                        throw null;
                                                    }
                                                }
                                            }
                                            C2716f fVar20 = this.f9463q0;
                                            if (fVar20 != null) {
                                                fVar20.f9331b.setOnClickListener(this);
                                                C2716f fVar21 = this.f9463q0;
                                                if (fVar21 != null) {
                                                    fVar21.f9337h.setOnCheckedChangeListener(this);
                                                    C2716f fVar22 = this.f9463q0;
                                                    if (fVar22 != null) {
                                                        fVar22.f9336g.setOnCheckedChangeListener(this);
                                                        C2716f fVar23 = this.f9463q0;
                                                        if (fVar23 != null) {
                                                            fVar23.f9338i.setOnCheckedChangeListener(this);
                                                            C2716f fVar24 = this.f9463q0;
                                                            if (fVar24 != null) {
                                                                fVar24.f9335f.setOnCheckedChangeListener(this);
                                                                C2716f fVar25 = this.f9463q0;
                                                                if (fVar25 != null) {
                                                                    fVar25.f9345p.setOnClickListener(new C2747f(this));
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
    }

    /* renamed from: X2 */
    public void mo3831X2() {
        super.mo3831X2();
        C1698d dVar = this.f9464r0;
        if (dVar != null) {
            dVar.mo3832Y2();
        }
    }

    /* renamed from: e1 */
    public void mo3662e1(int i, int i2, Intent intent) {
        super.mo3662e1(i, i2, intent);
        if (i == mo3591G0() && i2 == 0) {
            C2716f fVar = this.f9463q0;
            if (fVar != null) {
                int childCount = fVar.f9338i.getChildCount();
                if (childCount > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        C2716f fVar2 = this.f9463q0;
                        if (fVar2 != null) {
                            View childAt = fVar2.f9338i.getChildAt(i3);
                            Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.coocent.videoplayer.weidget.view.ValueRadioButton");
                            ValueRadioButton valueRadioButton = (ValueRadioButton) childAt;
                            String value = valueRadioButton.getValue();
                            C8594l.m46770d(value, "radioButton.value");
                            int parseInt = Integer.parseInt(value);
                            PlayerHelper.Companion companion = PlayerHelper.Companion;
                            Application application = mo3705u2().getApplication();
                            C8594l.m46770d(application, "requireActivity().application");
                            valueRadioButton.setChecked(parseInt == companion.getInstance(application).getSleepMode());
                            if (i4 < childCount) {
                                i3 = i4;
                            } else {
                                return;
                            }
                        } else {
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                    }
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        Bundle V = mo3638V();
        if (V != null) {
            this.f9465s0 = V.getBoolean("landscape", false);
        }
        mo3839f3(2, this.f9465s0 ? C2709p.VideoTheme_Dialog_FullScreen : C2709p.VideoTheme_Dialog_Normal);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        boolean z;
        boolean z2;
        C8594l.m46771e(radioGroup, "group");
        if (mo3705u2() instanceof C2765b) {
            C2765b bVar = (C2765b) mo3705u2();
            ValueRadioButton valueRadioButton = (ValueRadioButton) radioGroup.findViewById(i);
            if (i == C2706m.rb_ratio_fit) {
                bVar.mo10200w0(C6722a.AspectRatio_FIT_PARENT);
            } else if (i == C2706m.rb_ratio_fill) {
                bVar.mo10200w0(C6722a.AspectRatio_FILL_PARENT);
            } else if (i == C2706m.rb_ratio_match) {
                bVar.mo10200w0(C6722a.AspectRatio_MATCH_PARENT);
            } else if (i == C2706m.rb_ratio_origin) {
                bVar.mo10200w0(C6722a.AspectRatio_ORIGIN);
            } else if (i == C2706m.rb_ratio_16_9) {
                bVar.mo10200w0(C6722a.AspectRatio_16_9);
            } else if (i == C2706m.rb_ratio_4_3) {
                bVar.mo10200w0(C6722a.AspectRatio_4_3);
            } else {
                boolean z3 = false;
                if (!((i == C2706m.rb_play_speed_0_5 || i == C2706m.rb_play_speed_0_75) || i == C2706m.rb_play_speed_1) && i != C2706m.rb_play_speed_1_25) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || i == C2706m.rb_play_speed_1_5) {
                    bVar.mo10194X0(Float.parseFloat(valueRadioButton.getText().toString()));
                    return;
                }
                if (!(((i == C2706m.rb_sleep_off || i == C2706m.rb_sleep_10) || i == C2706m.rb_sleep_30) || i == C2706m.rb_sleep_60) && i != C2706m.rb_sleep_90) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    String value = valueRadioButton.getValue();
                    C8594l.m46770d(value, "radioButton.value");
                    int parseInt = Integer.parseInt(value);
                    String value2 = valueRadioButton.getValue();
                    C8594l.m46770d(value2, "radioButton.value");
                    bVar.mo10199n0(parseInt, Long.parseLong(value2) * ((long) 60) * ((long) 1000));
                } else if (i == C2706m.rb_sleep_custom) {
                    C1698d.C1699a aVar = new C1698d.C1699a();
                    aVar.mo7554f(C2708o.video_sleep);
                    aVar.mo7552d(C2708o.video_sleep_custom_minute);
                    aVar.mo7553e(C2703j.videoColorPrimary_dark);
                    aVar.mo7555g(C2703j.videoTextColorPrimary_dark);
                    int i2 = C2703j.videoColorSecondary_dark;
                    aVar.mo7550b(i2);
                    aVar.mo7551c(i2);
                    C8457t tVar = C8457t.f34900a;
                    C1698d a = aVar.mo7549a();
                    a.mo3621P2(this, a.mo3591G0());
                    a.mo7548N3(new C2767d(this, bVar));
                    this.f9464r0 = a;
                    if (a != null) {
                        a.mo3841h3(mo3693q0(), "timePick");
                    }
                } else {
                    if ((i == C2706m.rb_play_mode_sequential_play || i == C2706m.rb_play_mode_list_loop) || i == C2706m.rb_play_mode_single_cycle) {
                        z3 = true;
                    }
                    if (z3) {
                        String value3 = valueRadioButton.getValue();
                        C8594l.m46770d(value3, "radioButton.value");
                        bVar.mo10198k0(Integer.parseInt(value3));
                    }
                }
            }
        }
    }

    public void onClick(View view) {
        Integer valueOf = view == null ? null : Integer.valueOf(view.getId());
        int i = C2706m.rb_audio_mode;
        if (valueOf != null && valueOf.intValue() == i && (mo3705u2() instanceof C2765b)) {
            ((C2765b) mo3705u2()).mo10197i0();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C8594l.m46771e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C1698d dVar = this.f9464r0;
        if (dVar != null) {
            dVar.mo3832Y2();
        }
        mo3832Y2();
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C8594l.m46771e(layoutInflater, "inflater");
        Dialog a3 = mo3834a3();
        if (a3 != null) {
            a3.setCanceledOnTouchOutside(true);
            Window window = a3.getWindow();
            if (window != null && (i = Build.VERSION.SDK_INT) >= 21) {
                window.getDecorView().setSystemUiVisibility(5888);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(Color.parseColor("#99000000"));
                window.setNavigationBarColor(Color.parseColor("#99000000"));
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    C8594l.m46770d(attributes, "it.attributes");
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
            }
        }
        C2716f d = C2716f.m12292d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f9463q0 = d;
        LinearLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…nding = it\n        }.root");
        return c;
    }
}
