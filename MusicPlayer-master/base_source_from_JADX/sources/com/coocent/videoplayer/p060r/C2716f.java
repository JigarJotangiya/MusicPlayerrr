package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.coocent.videoplayer.C2707n;
import com.coocent.videoplayer.weidget.view.ValueRadioButton;
import p082e.p157y.C4257a;

/* renamed from: com.coocent.videoplayer.r.f */
/* compiled from: VideoLayoutDialogMoreBinding */
public final class C2716f implements C4257a {

    /* renamed from: a */
    private final LinearLayout f9330a;

    /* renamed from: b */
    public final ValueRadioButton f9331b;

    /* renamed from: c */
    public final ValueRadioButton f9332c;

    /* renamed from: d */
    public final ValueRadioButton f9333d;

    /* renamed from: e */
    public final RadioGroup f9334e;

    /* renamed from: f */
    public final RadioGroup f9335f;

    /* renamed from: g */
    public final RadioGroup f9336g;

    /* renamed from: h */
    public final RadioGroup f9337h;

    /* renamed from: i */
    public final RadioGroup f9338i;

    /* renamed from: j */
    public final AppCompatTextView f9339j;

    /* renamed from: k */
    public final AppCompatTextView f9340k;

    /* renamed from: l */
    public final View f9341l;

    /* renamed from: m */
    public final View f9342m;

    /* renamed from: n */
    public final View f9343n;

    /* renamed from: o */
    public final View f9344o;

    /* renamed from: p */
    public final View f9345p;

    private C2716f(LinearLayout linearLayout, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, ValueRadioButton valueRadioButton, ValueRadioButton valueRadioButton2, ValueRadioButton valueRadioButton3, ValueRadioButton valueRadioButton4, ValueRadioButton valueRadioButton5, ValueRadioButton valueRadioButton6, ValueRadioButton valueRadioButton7, ValueRadioButton valueRadioButton8, ValueRadioButton valueRadioButton9, ValueRadioButton valueRadioButton10, ValueRadioButton valueRadioButton11, ValueRadioButton valueRadioButton12, ValueRadioButton valueRadioButton13, ValueRadioButton valueRadioButton14, ValueRadioButton valueRadioButton15, ValueRadioButton valueRadioButton16, ValueRadioButton valueRadioButton17, ValueRadioButton valueRadioButton18, ValueRadioButton valueRadioButton19, ValueRadioButton valueRadioButton20, ValueRadioButton valueRadioButton21, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, RadioGroup radioGroup4, RadioGroup radioGroup5, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, View view, View view2, View view3, View view4, View view5) {
        this.f9330a = linearLayout;
        this.f9331b = valueRadioButton;
        this.f9332c = valueRadioButton20;
        this.f9333d = valueRadioButton21;
        this.f9334e = radioGroup;
        this.f9335f = radioGroup2;
        this.f9336g = radioGroup3;
        this.f9337h = radioGroup4;
        this.f9338i = radioGroup5;
        this.f9339j = appCompatTextView;
        this.f9340k = appCompatTextView2;
        this.f9341l = view;
        this.f9342m = view2;
        this.f9343n = view3;
        this.f9344o = view4;
        this.f9345p = view5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0177, code lost:
        r1 = com.coocent.videoplayer.C2706m.view_audio_separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017f, code lost:
        r1 = com.coocent.videoplayer.C2706m.view_play_speed_separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0187, code lost:
        r1 = com.coocent.videoplayer.C2706m.view_ratio_separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018f, code lost:
        r1 = com.coocent.videoplayer.C2706m.view_sleep_separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        r1 = com.coocent.videoplayer.C2706m.view_top;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.coocent.videoplayer.p060r.C2716f m12291b(android.view.View r42) {
        /*
            r0 = r42
            int r1 = com.coocent.videoplayer.C2706m.layout_container
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r5 = r2
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.layout_scroll
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r6 = r2
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            if (r6 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_audio_mode
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r7 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r7 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r7
            if (r7 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_mode_list_loop
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r8 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r8 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r8
            if (r8 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_mode_sequential_play
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r9 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r9 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r9
            if (r9 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_mode_single_cycle
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r10 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r10 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r10
            if (r10 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_speed_0_5
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r11 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r11 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r11
            if (r11 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_speed_0_75
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r12 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r12 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r12
            if (r12 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_speed_1
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r13 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r13 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r13
            if (r13 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_speed_1_25
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r14 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r14 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r14
            if (r14 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_play_speed_1_5
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r15 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r15 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r15
            if (r15 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_ratio_16_9
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r16 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r16 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r16
            if (r16 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_ratio_4_3
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r17 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r17 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r17
            if (r17 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_ratio_fill
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r18 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r18 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r18
            if (r18 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_ratio_fit
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r19 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r19 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r19
            if (r19 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_ratio_match
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r20 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r20 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r20
            if (r20 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_ratio_origin
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r21 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r21 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r21
            if (r21 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_sleep_10
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r22 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r22 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r22
            if (r22 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_sleep_30
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r23 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r23 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r23
            if (r23 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_sleep_60
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r24 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r24 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r24
            if (r24 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_sleep_90
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r25 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r25 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r25
            if (r25 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_sleep_custom
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r26 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r26 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r26
            if (r26 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rb_sleep_off
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r27 = r2
            com.coocent.videoplayer.weidget.view.ValueRadioButton r27 = (com.coocent.videoplayer.weidget.view.ValueRadioButton) r27
            if (r27 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rg_audio_mode
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r28 = r2
            android.widget.RadioGroup r28 = (android.widget.RadioGroup) r28
            if (r28 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rg_play_mode
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r29 = r2
            android.widget.RadioGroup r29 = (android.widget.RadioGroup) r29
            if (r29 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rg_play_speed
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r30 = r2
            android.widget.RadioGroup r30 = (android.widget.RadioGroup) r30
            if (r30 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rg_screen_ratio
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r31 = r2
            android.widget.RadioGroup r31 = (android.widget.RadioGroup) r31
            if (r31 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.rg_sleep
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r32 = r2
            android.widget.RadioGroup r32 = (android.widget.RadioGroup) r32
            if (r32 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.tv_play_mode
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r33 = r2
            androidx.appcompat.widget.AppCompatTextView r33 = (androidx.appcompat.widget.AppCompatTextView) r33
            if (r33 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.tv_play_speed
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r34 = r2
            androidx.appcompat.widget.AppCompatTextView r34 = (androidx.appcompat.widget.AppCompatTextView) r34
            if (r34 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.tv_ratio
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r35 = r2
            androidx.appcompat.widget.AppCompatTextView r35 = (androidx.appcompat.widget.AppCompatTextView) r35
            if (r35 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.tv_sleep
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r0, r1)
            r36 = r2
            androidx.appcompat.widget.AppCompatTextView r36 = (androidx.appcompat.widget.AppCompatTextView) r36
            if (r36 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.view_audio_separator
            android.view.View r37 = p082e.p157y.C4258b.m18705a(r0, r1)
            if (r37 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.view_play_speed_separator
            android.view.View r38 = p082e.p157y.C4258b.m18705a(r0, r1)
            if (r38 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.view_ratio_separator
            android.view.View r39 = p082e.p157y.C4258b.m18705a(r0, r1)
            if (r39 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.view_sleep_separator
            android.view.View r40 = p082e.p157y.C4258b.m18705a(r0, r1)
            if (r40 == 0) goto L_0x01a9
            int r1 = com.coocent.videoplayer.C2706m.view_top
            android.view.View r41 = p082e.p157y.C4258b.m18705a(r0, r1)
            if (r41 == 0) goto L_0x01a9
            com.coocent.videoplayer.r.f r1 = new com.coocent.videoplayer.r.f
            r3 = r1
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            return r1
        L_0x01a9:
            android.content.res.Resources r0 = r42.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videoplayer.p060r.C2716f.m12291b(android.view.View):com.coocent.videoplayer.r.f");
    }

    /* renamed from: d */
    public static C2716f m12292d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_dialog_more, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12291b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f9330a;
    }
}
