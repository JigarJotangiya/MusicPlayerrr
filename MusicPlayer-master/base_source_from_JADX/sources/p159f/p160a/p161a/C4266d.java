package p159f.p160a.p161a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.C1434b;
import com.afollestad.materialdialogs.internal.C1435c;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.util.ArrayList;
import java.util.Arrays;
import p159f.p160a.p161a.C4269f;
import p159f.p160a.p161a.p163r.C4297a;
import p453me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import p453me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import p453me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

/* renamed from: f.a.a.d */
/* compiled from: DialogInit */
class C4266d {
    /* renamed from: a */
    private static void m18716a(ProgressBar progressBar) {
        if (Build.VERSION.SDK_INT < 18 && progressBar.isHardwareAccelerated() && progressBar.getLayerType() != 1) {
            progressBar.setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: b */
    static int m18717b(C4269f.C4274d dVar) {
        if (dVar.f12836s != null) {
            return C4289l.md_dialog_custom;
        }
        if (dVar.f12822l == null && dVar.f12797X == null) {
            if (dVar.f12821k0 > -2) {
                return C4289l.md_dialog_progress;
            }
            if (dVar.f12817i0) {
                if (dVar.f12762B0) {
                    return C4289l.md_dialog_progress_indeterminate_horizontal;
                }
                return C4289l.md_dialog_progress_indeterminate;
            } else if (dVar.f12829o0 != null) {
                if (dVar.f12845w0 != null) {
                    return C4289l.md_dialog_input_check;
                }
                return C4289l.md_dialog_input;
            } else if (dVar.f12845w0 != null) {
                return C4289l.md_dialog_basic_check;
            } else {
                return C4289l.md_dialog_basic;
            }
        } else if (dVar.f12845w0 != null) {
            return C4289l.md_dialog_list_check;
        } else {
            return C4289l.md_dialog_list;
        }
    }

    /* renamed from: c */
    static int m18718c(C4269f.C4274d dVar) {
        Context context = dVar.f12800a;
        int i = C4284g.md_dark_theme;
        C4293p pVar = dVar.f12779K;
        C4293p pVar2 = C4293p.DARK;
        boolean k = C4297a.m18797k(context, i, pVar == pVar2);
        if (!k) {
            pVar2 = C4293p.LIGHT;
        }
        dVar.f12779K = pVar2;
        return k ? C4290m.MD_Dark : C4290m.MD_Light;
    }

    /* renamed from: d */
    static void m18719d(C4269f fVar) {
        boolean z;
        C4269f.C4274d dVar = fVar.f12735i;
        fVar.setCancelable(dVar.f12781L);
        fVar.setCanceledOnTouchOutside(dVar.f12783M);
        if (dVar.f12813g0 == 0) {
            dVar.f12813g0 = C4297a.m18799m(dVar.f12800a, C4284g.md_background_color, C4297a.m18798l(fVar.getContext(), C4284g.colorBackgroundFloating));
        }
        if (dVar.f12813g0 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dVar.f12800a.getResources().getDimension(C4286i.md_bg_corner_radius));
            gradientDrawable.setColor(dVar.f12813g0);
            fVar.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!dVar.f12770F0) {
            dVar.f12842v = C4297a.m18795i(dVar.f12800a, C4284g.md_positive_color, dVar.f12842v);
        }
        if (!dVar.f12772G0) {
            dVar.f12846x = C4297a.m18795i(dVar.f12800a, C4284g.md_neutral_color, dVar.f12846x);
        }
        if (!dVar.f12774H0) {
            dVar.f12844w = C4297a.m18795i(dVar.f12800a, C4284g.md_negative_color, dVar.f12844w);
        }
        if (!dVar.f12776I0) {
            dVar.f12838t = C4297a.m18799m(dVar.f12800a, C4284g.md_widget_color, dVar.f12838t);
        }
        if (!dVar.f12764C0) {
            dVar.f12816i = C4297a.m18799m(dVar.f12800a, C4284g.md_title_color, C4297a.m18798l(fVar.getContext(), 16842806));
        }
        if (!dVar.f12766D0) {
            dVar.f12818j = C4297a.m18799m(dVar.f12800a, C4284g.md_content_color, C4297a.m18798l(fVar.getContext(), 16842808));
        }
        if (!dVar.f12768E0) {
            dVar.f12815h0 = C4297a.m18799m(dVar.f12800a, C4284g.md_item_color, dVar.f12818j);
        }
        fVar.f12737k = (TextView) fVar.f12730g.findViewById(C4288k.md_title);
        fVar.f12736j = (ImageView) fVar.f12730g.findViewById(C4288k.md_icon);
        fVar.f12741o = fVar.f12730g.findViewById(C4288k.md_titleFrame);
        fVar.f12738l = (TextView) fVar.f12730g.findViewById(C4288k.md_content);
        fVar.f12740n = (RecyclerView) fVar.f12730g.findViewById(C4288k.md_contentRecyclerView);
        fVar.f12747u = (CheckBox) fVar.f12730g.findViewById(C4288k.md_promptCheckbox);
        fVar.f12748v = (MDButton) fVar.f12730g.findViewById(C4288k.md_buttonDefaultPositive);
        fVar.f12749w = (MDButton) fVar.f12730g.findViewById(C4288k.md_buttonDefaultNeutral);
        fVar.f12750x = (MDButton) fVar.f12730g.findViewById(C4288k.md_buttonDefaultNegative);
        if (dVar.f12829o0 != null && dVar.f12824m == null) {
            dVar.f12824m = dVar.f12800a.getText(17039370);
        }
        fVar.f12748v.setVisibility(dVar.f12824m != null ? 0 : 8);
        fVar.f12749w.setVisibility(dVar.f12826n != null ? 0 : 8);
        fVar.f12750x.setVisibility(dVar.f12828o != null ? 0 : 8);
        fVar.f12748v.setFocusable(true);
        fVar.f12749w.setFocusable(true);
        fVar.f12750x.setFocusable(true);
        if (dVar.f12830p) {
            fVar.f12748v.requestFocus();
        }
        if (dVar.f12832q) {
            fVar.f12749w.requestFocus();
        }
        if (dVar.f12834r) {
            fVar.f12750x.requestFocus();
        }
        if (dVar.f12794U != null) {
            fVar.f12736j.setVisibility(0);
            fVar.f12736j.setImageDrawable(dVar.f12794U);
        } else {
            Drawable p = C4297a.m18802p(dVar.f12800a, C4284g.md_icon);
            if (p != null) {
                fVar.f12736j.setVisibility(0);
                fVar.f12736j.setImageDrawable(p);
            } else {
                fVar.f12736j.setVisibility(8);
            }
        }
        int i = dVar.f12796W;
        if (i == -1) {
            i = C4297a.m18800n(dVar.f12800a, C4284g.md_icon_max_size);
        }
        if (dVar.f12795V || C4297a.m18796j(dVar.f12800a, C4284g.md_icon_limit_icon_to_default_size)) {
            i = dVar.f12800a.getResources().getDimensionPixelSize(C4286i.md_icon_max_size);
        }
        if (i > -1) {
            fVar.f12736j.setAdjustViewBounds(true);
            fVar.f12736j.setMaxHeight(i);
            fVar.f12736j.setMaxWidth(i);
            fVar.f12736j.requestLayout();
        }
        if (!dVar.f12778J0) {
            dVar.f12811f0 = C4297a.m18799m(dVar.f12800a, C4284g.md_divider_color, C4297a.m18798l(fVar.getContext(), C4284g.md_divider));
        }
        fVar.f12730g.setDividerColor(dVar.f12811f0);
        TextView textView = fVar.f12737k;
        if (textView != null) {
            fVar.mo14591A(textView, dVar.f12793T);
            fVar.f12737k.setTextColor(dVar.f12816i);
            fVar.f12737k.setGravity(dVar.f12804c.getGravityInt());
            if (Build.VERSION.SDK_INT >= 17) {
                fVar.f12737k.setTextAlignment(dVar.f12804c.getTextAlignment());
            }
            CharSequence charSequence = dVar.f12802b;
            if (charSequence == null) {
                fVar.f12741o.setVisibility(8);
            } else {
                fVar.f12737k.setText(charSequence);
                fVar.f12741o.setVisibility(0);
            }
        }
        TextView textView2 = fVar.f12738l;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            fVar.mo14591A(fVar.f12738l, dVar.f12792S);
            fVar.f12738l.setLineSpacing(0.0f, dVar.f12785N);
            ColorStateList colorStateList = dVar.f12848y;
            if (colorStateList == null) {
                fVar.f12738l.setLinkTextColor(C4297a.m18798l(fVar.getContext(), 16842806));
            } else {
                fVar.f12738l.setLinkTextColor(colorStateList);
            }
            fVar.f12738l.setTextColor(dVar.f12818j);
            fVar.f12738l.setGravity(dVar.f12806d.getGravityInt());
            if (Build.VERSION.SDK_INT >= 17) {
                fVar.f12738l.setTextAlignment(dVar.f12806d.getTextAlignment());
            }
            CharSequence charSequence2 = dVar.f12820k;
            if (charSequence2 != null) {
                fVar.f12738l.setText(charSequence2);
                fVar.f12738l.setVisibility(0);
            } else {
                fVar.f12738l.setVisibility(8);
            }
        }
        CheckBox checkBox = fVar.f12747u;
        if (checkBox != null) {
            checkBox.setText(dVar.f12845w0);
            fVar.f12747u.setChecked(dVar.f12847x0);
            fVar.f12747u.setOnCheckedChangeListener(dVar.f12849y0);
            fVar.mo14591A(fVar.f12747u, dVar.f12792S);
            fVar.f12747u.setTextColor(dVar.f12818j);
            C1435c.m7535c(fVar.f12747u, dVar.f12838t);
        }
        fVar.f12730g.setButtonGravity(dVar.f12812g);
        fVar.f12730g.setButtonStackedGravity(dVar.f12808e);
        fVar.f12730g.setStackingBehavior(dVar.f12807d0);
        if (Build.VERSION.SDK_INT >= 14) {
            z = C4297a.m18797k(dVar.f12800a, 16843660, true);
            if (z) {
                z = C4297a.m18797k(dVar.f12800a, C4284g.textAllCaps, true);
            }
        } else {
            z = C4297a.m18797k(dVar.f12800a, C4284g.textAllCaps, true);
        }
        MDButton mDButton = fVar.f12748v;
        fVar.mo14591A(mDButton, dVar.f12793T);
        mDButton.setAllCapsCompat(z);
        mDButton.setText(dVar.f12824m);
        mDButton.setTextColor(dVar.f12842v);
        MDButton mDButton2 = fVar.f12748v;
        C4264b bVar = C4264b.POSITIVE;
        mDButton2.setStackedSelector(fVar.mo14597p(bVar, true));
        fVar.f12748v.setDefaultSelector(fVar.mo14597p(bVar, false));
        fVar.f12748v.setTag(bVar);
        fVar.f12748v.setOnClickListener(fVar);
        MDButton mDButton3 = fVar.f12750x;
        fVar.mo14591A(mDButton3, dVar.f12793T);
        mDButton3.setAllCapsCompat(z);
        mDButton3.setText(dVar.f12828o);
        mDButton3.setTextColor(dVar.f12844w);
        MDButton mDButton4 = fVar.f12750x;
        C4264b bVar2 = C4264b.NEGATIVE;
        mDButton4.setStackedSelector(fVar.mo14597p(bVar2, true));
        fVar.f12750x.setDefaultSelector(fVar.mo14597p(bVar2, false));
        fVar.f12750x.setTag(bVar2);
        fVar.f12750x.setOnClickListener(fVar);
        MDButton mDButton5 = fVar.f12749w;
        fVar.mo14591A(mDButton5, dVar.f12793T);
        mDButton5.setAllCapsCompat(z);
        mDButton5.setText(dVar.f12826n);
        mDButton5.setTextColor(dVar.f12846x);
        MDButton mDButton6 = fVar.f12749w;
        C4264b bVar3 = C4264b.NEUTRAL;
        mDButton6.setStackedSelector(fVar.mo14597p(bVar3, true));
        fVar.f12749w.setDefaultSelector(fVar.mo14597p(bVar3, false));
        fVar.f12749w.setTag(bVar3);
        fVar.f12749w.setOnClickListener(fVar);
        if (dVar.f12773H != null) {
            fVar.f12752z = new ArrayList();
        }
        if (fVar.f12740n != null) {
            RecyclerView.C0797h<?> hVar = dVar.f12797X;
            if (hVar == null) {
                if (dVar.f12771G != null) {
                    fVar.f12751y = C4269f.C4282l.SINGLE;
                } else if (dVar.f12773H != null) {
                    fVar.f12751y = C4269f.C4282l.MULTI;
                    if (dVar.f12789P != null) {
                        fVar.f12752z = new ArrayList(Arrays.asList(dVar.f12789P));
                        dVar.f12789P = null;
                    }
                } else {
                    fVar.f12751y = C4269f.C4282l.REGULAR;
                }
                dVar.f12797X = new C4260a(fVar, C4269f.C4282l.getLayoutForType(fVar.f12751y));
            } else if (hVar instanceof C1434b) {
                ((C1434b) hVar).mo6868a(fVar);
            }
        }
        m18721f(fVar);
        m18720e(fVar);
        if (dVar.f12836s != null) {
            ((MDRootLayout) fVar.f12730g.findViewById(C4288k.md_root)).mo6863t();
            FrameLayout frameLayout = (FrameLayout) fVar.f12730g.findViewById(C4288k.md_customViewFrame);
            fVar.f12742p = frameLayout;
            View view = dVar.f12836s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (dVar.f12809e0) {
                Resources resources = fVar.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C4286i.md_dialog_frame_margin);
                ScrollView scrollView = new ScrollView(fVar.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C4286i.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(C4286i.md_content_padding_bottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = dVar.f12805c0;
        if (onShowListener != null) {
            fVar.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = dVar.f12801a0;
        if (onCancelListener != null) {
            fVar.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = dVar.f12799Z;
        if (onDismissListener != null) {
            fVar.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = dVar.f12803b0;
        if (onKeyListener != null) {
            fVar.setOnKeyListener(onKeyListener);
        }
        fVar.mo14581b();
        fVar.mo14605u();
        fVar.mo14582d(fVar.f12730g);
        fVar.mo14593f();
        Display defaultDisplay = fVar.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        int i3 = point.y;
        int dimensionPixelSize4 = dVar.f12800a.getResources().getDimensionPixelSize(C4286i.md_dialog_vertical_margin);
        int dimensionPixelSize5 = dVar.f12800a.getResources().getDimensionPixelSize(C4286i.md_dialog_horizontal_margin);
        fVar.f12730g.setMaxHeight(i3 - (dimensionPixelSize4 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(fVar.getWindow().getAttributes());
        layoutParams.width = Math.min(dVar.f12800a.getResources().getDimensionPixelSize(C4286i.md_dialog_max_width), i2 - (dimensionPixelSize5 * 2));
        fVar.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: e */
    private static void m18720e(C4269f fVar) {
        C4269f.C4274d dVar = fVar.f12735i;
        EditText editText = (EditText) fVar.f12730g.findViewById(16908297);
        fVar.f12739m = editText;
        if (editText != null) {
            fVar.mo14591A(editText, dVar.f12792S);
            CharSequence charSequence = dVar.f12825m0;
            if (charSequence != null) {
                fVar.f12739m.setText(charSequence);
            }
            fVar.mo14607y();
            fVar.f12739m.setHint(dVar.f12827n0);
            fVar.f12739m.setSingleLine();
            fVar.f12739m.setTextColor(dVar.f12818j);
            fVar.f12739m.setHintTextColor(C4297a.m18787a(dVar.f12818j, 0.3f));
            C1435c.m7537e(fVar.f12739m, fVar.f12735i.f12838t);
            int i = dVar.f12833q0;
            if (i != -1) {
                fVar.f12739m.setInputType(i);
                int i2 = dVar.f12833q0;
                if (i2 != 144 && (i2 & 128) == 128) {
                    fVar.f12739m.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            TextView textView = (TextView) fVar.f12730g.findViewById(C4288k.md_minMax);
            fVar.f12746t = textView;
            if (dVar.f12837s0 > 0 || dVar.f12839t0 > -1) {
                fVar.mo14604t(fVar.f12739m.getText().toString().length(), !dVar.f12831p0);
                return;
            }
            textView.setVisibility(8);
            fVar.f12746t = null;
        }
    }

    /* renamed from: f */
    private static void m18721f(C4269f fVar) {
        C4269f.C4274d dVar = fVar.f12735i;
        if (dVar.f12817i0 || dVar.f12821k0 > -2) {
            ProgressBar progressBar = (ProgressBar) fVar.f12730g.findViewById(16908301);
            fVar.f12743q = progressBar;
            if (progressBar != null) {
                if (Build.VERSION.SDK_INT < 14) {
                    C1435c.m7538f(progressBar, dVar.f12838t);
                } else if (!dVar.f12817i0) {
                    HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable(dVar.mo14636k());
                    horizontalProgressDrawable.setTint(dVar.f12838t);
                    fVar.f12743q.setProgressDrawable(horizontalProgressDrawable);
                    fVar.f12743q.setIndeterminateDrawable(horizontalProgressDrawable);
                } else if (dVar.f12762B0) {
                    IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(dVar.mo14636k());
                    indeterminateHorizontalProgressDrawable.setTint(dVar.f12838t);
                    fVar.f12743q.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                    fVar.f12743q.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
                } else {
                    IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(dVar.mo14636k());
                    indeterminateCircularProgressDrawable.setTint(dVar.f12838t);
                    fVar.f12743q.setProgressDrawable(indeterminateCircularProgressDrawable);
                    fVar.f12743q.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
                }
                boolean z = dVar.f12817i0;
                if (!z || dVar.f12762B0) {
                    fVar.f12743q.setIndeterminate(z && dVar.f12762B0);
                    fVar.f12743q.setProgress(0);
                    fVar.f12743q.setMax(dVar.f12823l0);
                    TextView textView = (TextView) fVar.f12730g.findViewById(C4288k.md_label);
                    fVar.f12744r = textView;
                    if (textView != null) {
                        textView.setTextColor(dVar.f12818j);
                        fVar.mo14591A(fVar.f12744r, dVar.f12793T);
                        fVar.f12744r.setText(dVar.f12760A0.format(0));
                    }
                    TextView textView2 = (TextView) fVar.f12730g.findViewById(C4288k.md_minMax);
                    fVar.f12745s = textView2;
                    if (textView2 != null) {
                        textView2.setTextColor(dVar.f12818j);
                        fVar.mo14591A(fVar.f12745s, dVar.f12792S);
                        if (dVar.f12819j0) {
                            fVar.f12745s.setVisibility(0);
                            fVar.f12745s.setText(String.format(dVar.f12851z0, new Object[]{0, Integer.valueOf(dVar.f12823l0)}));
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f12743q.getLayoutParams();
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = 0;
                        } else {
                            fVar.f12745s.setVisibility(8);
                        }
                    } else {
                        dVar.f12819j0 = false;
                    }
                }
            } else {
                return;
            }
        }
        ProgressBar progressBar2 = fVar.f12743q;
        if (progressBar2 != null) {
            m18716a(progressBar2);
        }
    }
}
