package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0320w;
import p082e.p083a.C3400a;
import p082e.p083a.C3402c;
import p082e.p083a.C3404e;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p110h.C3621a;

/* renamed from: androidx.appcompat.widget.f */
/* compiled from: AppCompatDrawableManager */
public final class C0275f {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1283b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0275f f1284c;

    /* renamed from: a */
    private C0320w f1285a;

    /* renamed from: androidx.appcompat.widget.f$a */
    /* compiled from: AppCompatDrawableManager */
    class C0276a implements C0320w.C0325e {

        /* renamed from: a */
        private final int[] f1286a = {C3404e.abc_textfield_search_default_mtrl_alpha, C3404e.abc_textfield_default_mtrl_alpha, C3404e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1287b = {C3404e.abc_ic_commit_search_api_mtrl_alpha, C3404e.abc_seekbar_tick_mark_material, C3404e.abc_ic_menu_share_mtrl_alpha, C3404e.abc_ic_menu_copy_mtrl_am_alpha, C3404e.abc_ic_menu_cut_mtrl_alpha, C3404e.abc_ic_menu_selectall_mtrl_alpha, C3404e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1288c = {C3404e.abc_textfield_activated_mtrl_alpha, C3404e.abc_textfield_search_activated_mtrl_alpha, C3404e.abc_cab_background_top_mtrl_alpha, C3404e.abc_text_cursor_material, C3404e.abc_text_select_handle_left_mtrl_dark, C3404e.abc_text_select_handle_middle_mtrl_dark, C3404e.abc_text_select_handle_right_mtrl_dark, C3404e.abc_text_select_handle_left_mtrl_light, C3404e.abc_text_select_handle_middle_mtrl_light, C3404e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f1289d = {C3404e.abc_popup_background_mtrl_mult, C3404e.abc_cab_background_internal_bg, C3404e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1290e = {C3404e.abc_tab_indicator_material, C3404e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1291f = {C3404e.abc_btn_check_material, C3404e.abc_btn_radio_material, C3404e.abc_btn_check_material_anim, C3404e.abc_btn_radio_material_anim};

        C0276a() {
        }

        /* renamed from: f */
        private boolean m1612f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1613g(Context context) {
            return m1614h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1614h(Context context, int i) {
            int c = C0268b0.m1572c(context, C3400a.colorControlHighlight);
            int b = C0268b0.m1571b(context, C3400a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0268b0.f1257b, C0268b0.f1259d, C0268b0.f1258c, C0268b0.f1261f}, new int[]{b, C3621a.m15591i(c, i), C3621a.m15591i(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1615i(Context context) {
            return m1614h(context, C0268b0.m1572c(context, C3400a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m1616j(Context context) {
            return m1614h(context, C0268b0.m1572c(context, C3400a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m1617k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C3400a.colorSwitchThumbNormal;
            ColorStateList e = C0268b0.m1574e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0268b0.f1257b;
                iArr2[0] = C0268b0.m1571b(context, i);
                iArr[1] = C0268b0.f1260e;
                iArr2[1] = C0268b0.m1572c(context, C3400a.colorControlActivated);
                iArr[2] = C0268b0.f1261f;
                iArr2[2] = C0268b0.m1572c(context, i);
            } else {
                iArr[0] = C0268b0.f1257b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0268b0.f1260e;
                iArr2[1] = C0268b0.m1572c(context, C3400a.colorControlActivated);
                iArr[2] = C0268b0.f1261f;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m1618l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0303p.m1828a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0275f.f1283b;
            }
            drawable.setColorFilter(C0275f.m1605e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1970a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0275f.f1283b
                int[] r1 = r6.f1286a
                boolean r1 = r6.m1612f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p082e.p083a.C3400a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1288c
                boolean r1 = r6.m1612f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p082e.p083a.C3400a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1289d
                boolean r1 = r6.m1612f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p082e.p083a.C3404e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p082e.p083a.C3404e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0303p.m1828a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0268b0.m1572c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0275f.m1605e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0275f.C0276a.mo1970a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public PorterDuff.Mode mo1971b(int i) {
            if (i == C3404e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: c */
        public Drawable mo1972c(C0320w wVar, Context context, int i) {
            if (i != C3404e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{wVar.mo2147j(context, C3404e.abc_cab_background_internal_bg), wVar.mo2147j(context, C3404e.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: d */
        public ColorStateList mo1973d(Context context, int i) {
            if (i == C3404e.abc_edit_text_material) {
                return C3410a.m14542c(context, C3402c.abc_tint_edittext);
            }
            if (i == C3404e.abc_switch_track_mtrl_alpha) {
                return C3410a.m14542c(context, C3402c.abc_tint_switch_track);
            }
            if (i == C3404e.abc_switch_thumb_material) {
                return m1617k(context);
            }
            if (i == C3404e.abc_btn_default_mtrl_shape) {
                return m1616j(context);
            }
            if (i == C3404e.abc_btn_borderless_material) {
                return m1613g(context);
            }
            if (i == C3404e.abc_btn_colored_material) {
                return m1615i(context);
            }
            if (i == C3404e.abc_spinner_mtrl_am_alpha || i == C3404e.abc_spinner_textfield_background_material) {
                return C3410a.m14542c(context, C3402c.abc_tint_spinner);
            }
            if (m1612f(this.f1287b, i)) {
                return C0268b0.m1574e(context, C3400a.colorControlNormal);
            }
            if (m1612f(this.f1290e, i)) {
                return C3410a.m14542c(context, C3402c.abc_tint_default);
            }
            if (m1612f(this.f1291f, i)) {
                return C3410a.m14542c(context, C3402c.abc_tint_btn_checkable);
            }
            if (i == C3404e.abc_seekbar_thumb_material) {
                return C3410a.m14542c(context, C3402c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo1974e(Context context, int i, Drawable drawable) {
            if (i == C3404e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C3400a.colorControlNormal;
                m1618l(findDrawableByLayerId, C0268b0.m1572c(context, i2), C0275f.f1283b);
                m1618l(layerDrawable.findDrawableByLayerId(16908303), C0268b0.m1572c(context, i2), C0275f.f1283b);
                m1618l(layerDrawable.findDrawableByLayerId(16908301), C0268b0.m1572c(context, C3400a.colorControlActivated), C0275f.f1283b);
                return true;
            } else if (i != C3404e.abc_ratingbar_material && i != C3404e.abc_ratingbar_indicator_material && i != C3404e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1618l(layerDrawable2.findDrawableByLayerId(16908288), C0268b0.m1571b(context, C3400a.colorControlNormal), C0275f.f1283b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C3400a.colorControlActivated;
                m1618l(findDrawableByLayerId2, C0268b0.m1572c(context, i3), C0275f.f1283b);
                m1618l(layerDrawable2.findDrawableByLayerId(16908301), C0268b0.m1572c(context, i3), C0275f.f1283b);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0275f m1604b() {
        C0275f fVar;
        synchronized (C0275f.class) {
            if (f1284c == null) {
                m1606h();
            }
            fVar = f1284c;
        }
        return fVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1605e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0275f.class) {
            l = C0320w.m1884l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1606h() {
        synchronized (C0275f.class) {
            if (f1284c == null) {
                C0275f fVar = new C0275f();
                f1284c = fVar;
                fVar.f1285a = C0320w.m1882h();
                f1284c.f1285a.mo2153u(new C0276a());
            }
        }
    }

    /* renamed from: i */
    static void m1607i(Drawable drawable, C0274e0 e0Var, int[] iArr) {
        C0320w.m1890w(drawable, e0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo1966c(Context context, int i) {
        return this.f1285a.mo2147j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo1967d(Context context, int i, boolean z) {
        return this.f1285a.mo2148k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo1968f(Context context, int i) {
        return this.f1285a.mo2149m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo1969g(Context context) {
        this.f1285a.mo2151s(context);
    }
}
