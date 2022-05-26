package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0275f;
import androidx.appcompat.widget.C0303p;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0556l;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C6061a;
import com.google.android.material.internal.C6065c;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p117n.C3679a;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7491c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class TextInputLayout extends LinearLayout {

    /* renamed from: S0 */
    private static final int f28997S0 = C7499k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private ColorStateList f28998A;

    /* renamed from: A0 */
    private ColorStateList f28999A0;

    /* renamed from: B */
    private ColorStateList f29000B;

    /* renamed from: B0 */
    private ColorStateList f29001B0;

    /* renamed from: C */
    private CharSequence f29002C;

    /* renamed from: C0 */
    private int f29003C0;

    /* renamed from: D */
    private final TextView f29004D;

    /* renamed from: D0 */
    private int f29005D0;

    /* renamed from: E */
    private CharSequence f29006E;

    /* renamed from: E0 */
    private int f29007E0;

    /* renamed from: F */
    private final TextView f29008F;

    /* renamed from: F0 */
    private ColorStateList f29009F0;

    /* renamed from: G */
    private boolean f29010G;

    /* renamed from: G0 */
    private int f29011G0;

    /* renamed from: H */
    private CharSequence f29012H;

    /* renamed from: H0 */
    private int f29013H0;

    /* renamed from: I */
    private boolean f29014I;

    /* renamed from: I0 */
    private int f29015I0;

    /* renamed from: J */
    private C7541h f29016J;

    /* renamed from: J0 */
    private int f29017J0;

    /* renamed from: K */
    private C7541h f29018K;

    /* renamed from: K0 */
    private int f29019K0;

    /* renamed from: L */
    private C7549m f29020L;

    /* renamed from: L0 */
    private boolean f29021L0;

    /* renamed from: M */
    private final int f29022M;

    /* renamed from: M0 */
    final C6061a f29023M0;

    /* renamed from: N */
    private int f29024N;

    /* renamed from: N0 */
    private boolean f29025N0;

    /* renamed from: O */
    private int f29026O;

    /* renamed from: O0 */
    private boolean f29027O0;

    /* renamed from: P */
    private int f29028P;

    /* renamed from: P0 */
    private ValueAnimator f29029P0;

    /* renamed from: Q */
    private int f29030Q;

    /* renamed from: Q0 */
    private boolean f29031Q0;

    /* renamed from: R */
    private int f29032R;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public boolean f29033R0;

    /* renamed from: S */
    private int f29034S;

    /* renamed from: T */
    private int f29035T;

    /* renamed from: U */
    private int f29036U;

    /* renamed from: V */
    private final Rect f29037V;

    /* renamed from: W */
    private final Rect f29038W;

    /* renamed from: a0 */
    private final RectF f29039a0;

    /* renamed from: b0 */
    private Typeface f29040b0;

    /* renamed from: c0 */
    private final CheckableImageButton f29041c0;

    /* renamed from: d0 */
    private ColorStateList f29042d0;

    /* renamed from: e0 */
    private boolean f29043e0;

    /* renamed from: f0 */
    private PorterDuff.Mode f29044f0;

    /* renamed from: g */
    private final FrameLayout f29045g;

    /* renamed from: g0 */
    private boolean f29046g0;

    /* renamed from: h */
    private final LinearLayout f29047h;

    /* renamed from: h0 */
    private Drawable f29048h0;

    /* renamed from: i */
    private final LinearLayout f29049i;

    /* renamed from: i0 */
    private int f29050i0;

    /* renamed from: j */
    private final FrameLayout f29051j;

    /* renamed from: j0 */
    private View.OnLongClickListener f29052j0;

    /* renamed from: k */
    EditText f29053k;

    /* renamed from: k0 */
    private final LinkedHashSet<C6222f> f29054k0;

    /* renamed from: l */
    private CharSequence f29055l;

    /* renamed from: l0 */
    private int f29056l0;

    /* renamed from: m */
    private int f29057m;

    /* renamed from: m0 */
    private final SparseArray<C6250e> f29058m0;

    /* renamed from: n */
    private int f29059n;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public final CheckableImageButton f29060n0;

    /* renamed from: o */
    private final C6251f f29061o;

    /* renamed from: o0 */
    private final LinkedHashSet<C6223g> f29062o0;

    /* renamed from: p */
    boolean f29063p;

    /* renamed from: p0 */
    private ColorStateList f29064p0;

    /* renamed from: q */
    private int f29065q;

    /* renamed from: q0 */
    private boolean f29066q0;

    /* renamed from: r */
    private boolean f29067r;

    /* renamed from: r0 */
    private PorterDuff.Mode f29068r0;

    /* renamed from: s */
    private TextView f29069s;

    /* renamed from: s0 */
    private boolean f29070s0;

    /* renamed from: t */
    private int f29071t;

    /* renamed from: t0 */
    private Drawable f29072t0;

    /* renamed from: u */
    private int f29073u;

    /* renamed from: u0 */
    private int f29074u0;

    /* renamed from: v */
    private CharSequence f29075v;

    /* renamed from: v0 */
    private Drawable f29076v0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f29077w;

    /* renamed from: w0 */
    private View.OnLongClickListener f29078w0;

    /* renamed from: x */
    private TextView f29079x;

    /* renamed from: x0 */
    private View.OnLongClickListener f29080x0;

    /* renamed from: y */
    private ColorStateList f29081y;

    /* renamed from: y0 */
    private final CheckableImageButton f29082y0;

    /* renamed from: z */
    private int f29083z;

    /* renamed from: z0 */
    private ColorStateList f29084z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6216a();

        /* renamed from: i */
        CharSequence f29085i;

        /* renamed from: j */
        boolean f29086j;

        /* renamed from: k */
        CharSequence f29087k;

        /* renamed from: l */
        CharSequence f29088l;

        /* renamed from: m */
        CharSequence f29089m;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        static class C6216a implements Parcelable.ClassLoaderCreator<SavedState> {
            C6216a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f29085i + " hint=" + this.f29087k + " helperText=" + this.f29088l + " placeholderText=" + this.f29089m + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f29085i, parcel, i);
            parcel.writeInt(this.f29086j ? 1 : 0);
            TextUtils.writeToParcel(this.f29087k, parcel, i);
            TextUtils.writeToParcel(this.f29088l, parcel, i);
            TextUtils.writeToParcel(this.f29089m, parcel, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29085i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29086j = parcel.readInt() != 1 ? false : true;
            this.f29087k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29088l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29089m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C6217a implements TextWatcher {
        C6217a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo25011v0(!textInputLayout.f29033R0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f29063p) {
                textInputLayout2.mo24920n0(editable.length());
            }
            if (TextInputLayout.this.f29077w) {
                TextInputLayout.this.m37238z0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C6218b implements Runnable {
        C6218b() {
        }

        public void run() {
            TextInputLayout.this.f29060n0.performClick();
            TextInputLayout.this.f29060n0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C6219c implements Runnable {
        C6219c() {
        }

        public void run() {
            TextInputLayout.this.f29053k.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C6220d implements ValueAnimator.AnimatorUpdateListener {
        C6220d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f29023M0.mo24146p0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C6221e extends C3704a {

        /* renamed from: d */
        private final TextInputLayout f29094d;

        public C6221e(TextInputLayout textInputLayout) {
            this.f29094d = textInputLayout;
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            EditText editText = this.f29094d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f29094d.getHint();
            CharSequence error = this.f29094d.getError();
            CharSequence placeholderText = this.f29094d.getPlaceholderText();
            int counterMaxLength = this.f29094d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f29094d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f29094d.mo24856N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : BuildConfig.FLAVOR;
            if (z) {
                cVar.mo13089E0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.mo13089E0(charSequence);
                if (z3 && placeholderText != null) {
                    cVar.mo13089E0(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                cVar.mo13089E0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.mo13133n0(charSequence);
                } else {
                    if (z) {
                        charSequence = text + ", " + charSequence;
                    }
                    cVar.mo13089E0(charSequence);
                }
                cVar.mo13081A0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo13137p0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo13126j0(error);
            }
            if (Build.VERSION.SDK_INT >= 17 && editText != null) {
                editText.setLabelFor(C7494f.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C6222f {
        /* renamed from: a */
        void mo25025a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C6223g {
        /* renamed from: a */
        void mo25026a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private boolean m37171A() {
        return this.f29010G && !TextUtils.isEmpty(this.f29012H) && (this.f29016J instanceof C6236c);
    }

    /* renamed from: A0 */
    private void m37172A0() {
        if (this.f29053k != null) {
            C3774v.m16156D0(this.f29004D, mo24858Q() ? 0 : C3774v.m16161G(this.f29053k), this.f29053k.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C7492d.material_input_text_to_prefix_suffix_padding), this.f29053k.getCompoundPaddingBottom());
        }
    }

    /* renamed from: B */
    private void m37173B() {
        Iterator it = this.f29054k0.iterator();
        while (it.hasNext()) {
            ((C6222f) it.next()).mo25025a(this);
        }
    }

    /* renamed from: B0 */
    private void m37174B0() {
        this.f29004D.setVisibility((this.f29002C == null || mo24856N()) ? 8 : 0);
        m37224r0();
    }

    /* renamed from: C */
    private void m37175C(int i) {
        Iterator it = this.f29062o0.iterator();
        while (it.hasNext()) {
            ((C6223g) it.next()).mo25026a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m37176C0(boolean z, boolean z2) {
        int defaultColor = this.f29009F0.getDefaultColor();
        int colorForState = this.f29009F0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f29009F0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f29035T = colorForState2;
        } else if (z2) {
            this.f29035T = colorForState;
        } else {
            this.f29035T = defaultColor;
        }
    }

    /* renamed from: D */
    private void m37177D(Canvas canvas) {
        C7541h hVar = this.f29018K;
        if (hVar != null) {
            Rect bounds = hVar.getBounds();
            bounds.top = bounds.bottom - this.f29030Q;
            this.f29018K.draw(canvas);
        }
    }

    /* renamed from: D0 */
    private void m37178D0() {
        if (this.f29053k != null) {
            C3774v.m16156D0(this.f29008F, getContext().getResources().getDimensionPixelSize(C7492d.material_input_text_to_prefix_suffix_padding), this.f29053k.getPaddingTop(), (mo24854K() || m37186L()) ? 0 : C3774v.m16159F(this.f29053k), this.f29053k.getPaddingBottom());
        }
    }

    /* renamed from: E */
    private void m37179E(Canvas canvas) {
        if (this.f29010G) {
            this.f29023M0.mo24142m(canvas);
        }
    }

    /* renamed from: E0 */
    private void m37180E0() {
        int visibility = this.f29008F.getVisibility();
        int i = 0;
        boolean z = this.f29006E != null && !mo24856N();
        TextView textView = this.f29008F;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f29008F.getVisibility()) {
            getEndIconDelegate().mo25028c(z);
        }
        m37224r0();
    }

    /* renamed from: F */
    private void m37181F(boolean z) {
        ValueAnimator valueAnimator = this.f29029P0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f29029P0.cancel();
        }
        if (!z || !this.f29027O0) {
            this.f29023M0.mo24146p0(0.0f);
        } else {
            mo24919i(0.0f);
        }
        if (m37171A() && ((C6236c) this.f29016J).mo25039q0()) {
            m37235y();
        }
        this.f29021L0 = true;
        m37185J();
        m37174B0();
        m37180E0();
    }

    /* renamed from: G */
    private int m37182G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f29053k.getCompoundPaddingLeft();
        return (this.f29002C == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f29004D.getMeasuredWidth()) + this.f29004D.getPaddingLeft();
    }

    /* renamed from: H */
    private int m37183H(int i, boolean z) {
        int compoundPaddingRight = i - this.f29053k.getCompoundPaddingRight();
        return (this.f29002C == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f29004D.getMeasuredWidth() - this.f29004D.getPaddingRight());
    }

    /* renamed from: I */
    private boolean m37184I() {
        return this.f29056l0 != 0;
    }

    /* renamed from: J */
    private void m37185J() {
        TextView textView = this.f29079x;
        if (textView != null && this.f29077w) {
            textView.setText((CharSequence) null);
            this.f29079x.setVisibility(4);
        }
    }

    /* renamed from: L */
    private boolean m37186L() {
        return this.f29082y0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m37187P() {
        if (this.f29026O != 1 || (Build.VERSION.SDK_INT >= 16 && this.f29053k.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private int[] m37188R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    private void m37189S() {
        m37219p();
        m37195a0();
        mo24853F0();
        m37211k0();
        m37205h();
        if (this.f29026O != 0) {
            m37229u0();
        }
    }

    /* renamed from: T */
    private void m37190T() {
        if (m37171A()) {
            RectF rectF = this.f29039a0;
            this.f29023M0.mo24145p(rectF, this.f29053k.getWidth(), this.f29053k.getGravity());
            m37212l(rectF);
            int i = this.f29030Q;
            this.f29024N = i;
            rectF.top = 0.0f;
            rectF.bottom = (float) i;
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C6236c) this.f29016J).mo25042w0(rectF);
        }
    }

    /* renamed from: U */
    private static void m37191U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m37191U((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m37192X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m37188R(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C0534a.m3292r(drawable).mutate();
            C0534a.m3289o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: Z */
    private void m37193Z() {
        TextView textView = this.f29079x;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    private void m37195a0() {
        if (m37206h0()) {
            C3774v.m16223r0(this.f29053k, this.f29016J);
        }
    }

    /* renamed from: b0 */
    private static void m37197b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean O = C3774v.m16176O(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (O || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(O);
        checkableImageButton.setPressable(O);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C3774v.m16237y0(checkableImageButton, i);
    }

    /* renamed from: c0 */
    private static void m37199c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m37197b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    private static void m37201d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m37197b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private boolean m37202f0() {
        return (this.f29082y0.getVisibility() == 0 || ((m37184I() && mo24854K()) || this.f29006E != null)) && this.f29049i.getMeasuredWidth() > 0;
    }

    /* renamed from: g */
    private void m37203g() {
        TextView textView = this.f29079x;
        if (textView != null) {
            this.f29045g.addView(textView);
            this.f29079x.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    private boolean m37204g0() {
        return !(getStartIconDrawable() == null && this.f29002C == null) && this.f29047h.getMeasuredWidth() > 0;
    }

    private C6250e getEndIconDelegate() {
        C6250e eVar = this.f29058m0.get(this.f29056l0);
        return eVar != null ? eVar : this.f29058m0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f29082y0.getVisibility() == 0) {
            return this.f29082y0;
        }
        if (!m37184I() || !mo24854K()) {
            return null;
        }
        return this.f29060n0;
    }

    /* renamed from: h */
    private void m37205h() {
        if (this.f29053k != null && this.f29026O == 1) {
            if (C7522c.m42021h(getContext())) {
                EditText editText = this.f29053k;
                C3774v.m16156D0(editText, C3774v.m16161G(editText), getResources().getDimensionPixelSize(C7492d.material_filled_edittext_font_2_0_padding_top), C3774v.m16159F(this.f29053k), getResources().getDimensionPixelSize(C7492d.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C7522c.m42020g(getContext())) {
                EditText editText2 = this.f29053k;
                C3774v.m16156D0(editText2, C3774v.m16161G(editText2), getResources().getDimensionPixelSize(C7492d.material_filled_edittext_font_1_3_padding_top), C3774v.m16159F(this.f29053k), getResources().getDimensionPixelSize(C7492d.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m37206h0() {
        EditText editText = this.f29053k;
        return (editText == null || this.f29016J == null || editText.getBackground() != null || this.f29026O == 0) ? false : true;
    }

    /* renamed from: i0 */
    private void m37207i0() {
        TextView textView = this.f29079x;
        if (textView != null && this.f29077w) {
            textView.setText(this.f29075v);
            this.f29079x.setVisibility(0);
            this.f29079x.bringToFront();
        }
    }

    /* renamed from: j */
    private void m37208j() {
        C7541h hVar = this.f29016J;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(this.f29020L);
            if (m37231w()) {
                this.f29016J.mo28477j0((float) this.f29030Q, this.f29035T);
            }
            int q = m37221q();
            this.f29036U = q;
            this.f29016J.mo28463a0(ColorStateList.valueOf(q));
            if (this.f29056l0 == 3) {
                this.f29053k.getBackground().invalidateSelf();
            }
            m37210k();
            invalidate();
        }
    }

    /* renamed from: j0 */
    private void m37209j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m37214m();
            return;
        }
        Drawable mutate = C0534a.m3292r(getEndIconDrawable()).mutate();
        C0534a.m3288n(mutate, this.f29061o.mo25069o());
        this.f29060n0.setImageDrawable(mutate);
    }

    /* renamed from: k */
    private void m37210k() {
        if (this.f29018K != null) {
            if (m37233x()) {
                this.f29018K.mo28463a0(ColorStateList.valueOf(this.f29035T));
            }
            invalidate();
        }
    }

    /* renamed from: k0 */
    private void m37211k0() {
        if (this.f29026O != 1) {
            return;
        }
        if (C7522c.m42021h(getContext())) {
            this.f29028P = getResources().getDimensionPixelSize(C7492d.material_font_2_0_box_collapsed_padding_top);
        } else if (C7522c.m42020g(getContext())) {
            this.f29028P = getResources().getDimensionPixelSize(C7492d.material_font_1_3_box_collapsed_padding_top);
        }
    }

    /* renamed from: l */
    private void m37212l(RectF rectF) {
        float f = rectF.left;
        int i = this.f29022M;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: l0 */
    private void m37213l0(Rect rect) {
        C7541h hVar = this.f29018K;
        if (hVar != null) {
            int i = rect.bottom;
            hVar.setBounds(rect.left, i - this.f29034S, rect.right, i);
        }
    }

    /* renamed from: m */
    private void m37214m() {
        m37216n(this.f29060n0, this.f29066q0, this.f29064p0, this.f29070s0, this.f29068r0);
    }

    /* renamed from: m0 */
    private void m37215m0() {
        if (this.f29069s != null) {
            EditText editText = this.f29053k;
            mo24920n0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: n */
    private void m37216n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0534a.m3292r(drawable).mutate();
            if (z) {
                C0534a.m3289o(drawable, colorStateList);
            }
            if (z2) {
                C0534a.m3290p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    private void m37217o() {
        m37216n(this.f29041c0, this.f29043e0, this.f29042d0, this.f29046g0, this.f29044f0);
    }

    /* renamed from: o0 */
    private static void m37218o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C7498j.character_counter_overflowed_content_description : C7498j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: p */
    private void m37219p() {
        int i = this.f29026O;
        if (i == 0) {
            this.f29016J = null;
            this.f29018K = null;
        } else if (i == 1) {
            this.f29016J = new C7541h(this.f29020L);
            this.f29018K = new C7541h();
        } else if (i == 2) {
            if (!this.f29010G || (this.f29016J instanceof C6236c)) {
                this.f29016J = new C7541h(this.f29020L);
            } else {
                this.f29016J = new C6236c(this.f29020L);
            }
            this.f29018K = null;
        } else {
            throw new IllegalArgumentException(this.f29026O + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: p0 */
    private void m37220p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f29069s;
        if (textView != null) {
            mo24868e0(textView, this.f29067r ? this.f29071t : this.f29073u);
            if (!this.f29067r && (colorStateList2 = this.f28998A) != null) {
                this.f29069s.setTextColor(colorStateList2);
            }
            if (this.f29067r && (colorStateList = this.f29000B) != null) {
                this.f29069s.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: q */
    private int m37221q() {
        return this.f29026O == 1 ? C7513a.m41982f(C7513a.m41981e(this, C7490b.colorSurface, 0), this.f29036U) : this.f29036U;
    }

    /* renamed from: q0 */
    private void m37222q0() {
        if (m37171A() && !this.f29021L0 && this.f29024N != this.f29030Q) {
            m37235y();
            m37190T();
        }
    }

    /* renamed from: r */
    private Rect m37223r(Rect rect) {
        if (this.f29053k != null) {
            Rect rect2 = this.f29038W;
            boolean z = C3774v.m16151B(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.f29026O;
            if (i == 1) {
                rect2.left = m37182G(rect.left, z);
                rect2.top = rect.top + this.f29028P;
                rect2.right = m37183H(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = m37182G(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = m37183H(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f29053k.getPaddingLeft();
                rect2.top = rect.top - m37230v();
                rect2.right = rect.right - this.f29053k.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m37224r0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f29053k
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m37204g0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f29047h
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f29053k
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f29048h0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f29050i0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f29048h0 = r6
            r10.f29050i0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f29053k
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0556l.m3419a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f29048h0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f29053k
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0556l.m3430l(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f29048h0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f29053k
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0556l.m3419a(r0)
            android.widget.EditText r6 = r10.f29053k
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0556l.m3430l(r6, r2, r7, r8, r0)
            r10.f29048h0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.m37202f0()
            if (r6 == 0) goto L_0x00d3
            android.widget.TextView r2 = r10.f29008F
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f29053k
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p082e.p109h.p119p.C3760h.m16094b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f29053k
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0556l.m3419a(r6)
            android.graphics.drawable.Drawable r7 = r10.f29072t0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f29074u0
            if (r8 == r2) goto L_0x00ad
            r10.f29074u0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f29053k
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f29072t0
            r3 = r6[r3]
            androidx.core.widget.C0556l.m3430l(r0, r1, r2, r4, r3)
            goto L_0x00f4
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f29072t0 = r7
            r10.f29074u0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f29072t0
            if (r2 == r7) goto L_0x00d1
            r0 = r6[r4]
            r10.f29076v0 = r0
            android.widget.EditText r0 = r10.f29053k
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.C0556l.m3430l(r0, r1, r2, r7, r3)
            goto L_0x00f4
        L_0x00d1:
            r5 = r0
            goto L_0x00f4
        L_0x00d3:
            android.graphics.drawable.Drawable r6 = r10.f29072t0
            if (r6 == 0) goto L_0x00f5
            android.widget.EditText r6 = r10.f29053k
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0556l.m3419a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f29072t0
            if (r4 != r7) goto L_0x00f1
            android.widget.EditText r0 = r10.f29053k
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f29076v0
            r3 = r6[r3]
            androidx.core.widget.C0556l.m3430l(r0, r1, r4, r7, r3)
            goto L_0x00f2
        L_0x00f1:
            r5 = r0
        L_0x00f2:
            r10.f29072t0 = r2
        L_0x00f4:
            r0 = r5
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m37224r0():boolean");
    }

    /* renamed from: s */
    private int m37225s(Rect rect, Rect rect2, float f) {
        if (m37187P()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f29053k.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f29053k == null) {
            if (this.f29056l0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f29053k = editText;
            setMinWidth(this.f29057m);
            setMaxWidth(this.f29059n);
            m37189S();
            setTextInputAccessibilityDelegate(new C6221e(this));
            this.f29023M0.mo24116C0(this.f29053k.getTypeface());
            this.f29023M0.mo24143m0(this.f29053k.getTextSize());
            int gravity = this.f29053k.getGravity();
            this.f29023M0.mo24134c0((gravity & -113) | 48);
            this.f29023M0.mo24141l0(gravity);
            this.f29053k.addTextChangedListener(new C6217a());
            if (this.f28999A0 == null) {
                this.f28999A0 = this.f29053k.getHintTextColors();
            }
            if (this.f29010G) {
                if (TextUtils.isEmpty(this.f29012H)) {
                    CharSequence hint = this.f29053k.getHint();
                    this.f29055l = hint;
                    setHint(hint);
                    this.f29053k.setHint((CharSequence) null);
                }
                this.f29014I = true;
            }
            if (this.f29069s != null) {
                mo24920n0(this.f29053k.getText().length());
            }
            mo24925s0();
            this.f29061o.mo25064e();
            this.f29047h.bringToFront();
            this.f29049i.bringToFront();
            this.f29051j.bringToFront();
            this.f29082y0.bringToFront();
            m37173B();
            m37172A0();
            m37178D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m37232w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f29082y0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f29051j;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m37178D0();
        if (!m37184I()) {
            m37224r0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f29012H)) {
            this.f29012H = charSequence;
            this.f29023M0.mo24112A0(charSequence);
            if (!this.f29021L0) {
                m37190T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f29077w != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f29079x = appCompatTextView;
                appCompatTextView.setId(C7494f.textinput_placeholder);
                C3774v.m16221q0(this.f29079x, 1);
                setPlaceholderTextAppearance(this.f29083z);
                setPlaceholderTextColor(this.f29081y);
                m37203g();
            } else {
                m37193Z();
                this.f29079x = null;
            }
            this.f29077w = z;
        }
    }

    /* renamed from: t */
    private int m37226t(Rect rect, float f) {
        if (m37187P()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f29053k.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    private boolean m37227t0() {
        int max;
        if (this.f29053k == null || this.f29053k.getMeasuredHeight() >= (max = Math.max(this.f29049i.getMeasuredHeight(), this.f29047h.getMeasuredHeight()))) {
            return false;
        }
        this.f29053k.setMinimumHeight(max);
        return true;
    }

    /* renamed from: u */
    private Rect m37228u(Rect rect) {
        if (this.f29053k != null) {
            Rect rect2 = this.f29038W;
            float B = this.f29023M0.mo24113B();
            rect2.left = rect.left + this.f29053k.getCompoundPaddingLeft();
            rect2.top = m37226t(rect, B);
            rect2.right = rect.right - this.f29053k.getCompoundPaddingRight();
            rect2.bottom = m37225s(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    private void m37229u0() {
        if (this.f29026O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f29045g.getLayoutParams();
            int v = m37230v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.f29045g.requestLayout();
            }
        }
    }

    /* renamed from: v */
    private int m37230v() {
        float s;
        if (!this.f29010G) {
            return 0;
        }
        int i = this.f29026O;
        if (i == 0 || i == 1) {
            s = this.f29023M0.mo24151s();
        } else if (i != 2) {
            return 0;
        } else {
            s = this.f29023M0.mo24151s() / 2.0f;
        }
        return (int) s;
    }

    /* renamed from: w */
    private boolean m37231w() {
        return this.f29026O == 2 && m37233x();
    }

    /* renamed from: w0 */
    private void m37232w0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f29053k;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f29053k;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f29061o.mo25066k();
        ColorStateList colorStateList2 = this.f28999A0;
        if (colorStateList2 != null) {
            this.f29023M0.mo24132b0(colorStateList2);
            this.f29023M0.mo24140k0(this.f28999A0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f28999A0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f29019K0) : this.f29019K0;
            this.f29023M0.mo24132b0(ColorStateList.valueOf(colorForState));
            this.f29023M0.mo24140k0(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.f29023M0.mo24132b0(this.f29061o.mo25070p());
        } else if (this.f29067r && (textView = this.f29069s) != null) {
            this.f29023M0.mo24132b0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f29001B0) != null) {
            this.f29023M0.mo24132b0(colorStateList);
        }
        if (z3 || !this.f29025N0 || (isEnabled() && z4)) {
            if (z2 || this.f29021L0) {
                m37237z(z);
            }
        } else if (z2 || !this.f29021L0) {
            m37181F(z);
        }
    }

    /* renamed from: x */
    private boolean m37233x() {
        return this.f29030Q > -1 && this.f29035T != 0;
    }

    /* renamed from: x0 */
    private void m37234x0() {
        EditText editText;
        if (this.f29079x != null && (editText = this.f29053k) != null) {
            this.f29079x.setGravity(editText.getGravity());
            this.f29079x.setPadding(this.f29053k.getCompoundPaddingLeft(), this.f29053k.getCompoundPaddingTop(), this.f29053k.getCompoundPaddingRight(), this.f29053k.getCompoundPaddingBottom());
        }
    }

    /* renamed from: y */
    private void m37235y() {
        if (m37171A()) {
            ((C6236c) this.f29016J).mo25040t0();
        }
    }

    /* renamed from: y0 */
    private void m37236y0() {
        EditText editText = this.f29053k;
        m37238z0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: z */
    private void m37237z(boolean z) {
        ValueAnimator valueAnimator = this.f29029P0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f29029P0.cancel();
        }
        if (!z || !this.f29027O0) {
            this.f29023M0.mo24146p0(1.0f);
        } else {
            mo24919i(1.0f);
        }
        this.f29021L0 = false;
        if (m37171A()) {
            m37190T();
        }
        m37236y0();
        m37174B0();
        m37180E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m37238z0(int i) {
        if (i != 0 || this.f29021L0) {
            m37185J();
        } else {
            m37207i0();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f29053k;
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24853F0() {
        /*
            r6 = this;
            f.f.b.b.w.h r0 = r6.f29016J
            if (r0 == 0) goto L_0x00f6
            int r0 = r6.f29026O
            if (r0 != 0) goto L_0x000a
            goto L_0x00f6
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f29053k
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f29053k
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f29019K0
            r6.f29035T = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.f29061o
            boolean r4 = r4.mo25066k()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.f29009F0
            if (r4 == 0) goto L_0x004f
            r6.m37176C0(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.f29061o
            int r4 = r4.mo25069o()
            r6.f29035T = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f29067r
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f29069s
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.f29009F0
            if (r5 == 0) goto L_0x0068
            r6.m37176C0(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.f29035T = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.f29007E0
            r6.f29035T = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.f29005D0
            r6.f29035T = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.f29003C0
            r6.f29035T = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f29061o
            boolean r4 = r4.mo25076x()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f29061o
            boolean r4 = r4.mo25066k()
            if (r4 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            r6.setErrorIconVisible(r1)
            r6.mo24860W()
            r6.mo24861Y()
            r6.mo24859V()
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo25044d()
            if (r1 == 0) goto L_0x00b7
            com.google.android.material.textfield.f r1 = r6.f29061o
            boolean r1 = r1.mo25066k()
            r6.m37209j0(r1)
        L_0x00b7:
            if (r0 == 0) goto L_0x00c4
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c4
            int r1 = r6.f29034S
            r6.f29030Q = r1
            goto L_0x00c8
        L_0x00c4:
            int r1 = r6.f29032R
            r6.f29030Q = r1
        L_0x00c8:
            int r1 = r6.f29026O
            r4 = 2
            if (r1 != r4) goto L_0x00d0
            r6.m37222q0()
        L_0x00d0:
            int r1 = r6.f29026O
            if (r1 != r2) goto L_0x00f3
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00df
            int r0 = r6.f29013H0
            r6.f29036U = r0
            goto L_0x00f3
        L_0x00df:
            if (r3 == 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e8
            int r0 = r6.f29017J0
            r6.f29036U = r0
            goto L_0x00f3
        L_0x00e8:
            if (r0 == 0) goto L_0x00ef
            int r0 = r6.f29015I0
            r6.f29036U = r0
            goto L_0x00f3
        L_0x00ef:
            int r0 = r6.f29011G0
            r6.f29036U = r0
        L_0x00f3:
            r6.m37208j()
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo24853F0():void");
    }

    /* renamed from: K */
    public boolean mo24854K() {
        return this.f29051j.getVisibility() == 0 && this.f29060n0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean mo24855M() {
        return this.f29061o.mo25077y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo24856N() {
        return this.f29021L0;
    }

    /* renamed from: O */
    public boolean mo24857O() {
        return this.f29014I;
    }

    /* renamed from: Q */
    public boolean mo24858Q() {
        return this.f29041c0.getVisibility() == 0;
    }

    /* renamed from: V */
    public void mo24859V() {
        m37192X(this.f29060n0, this.f29064p0);
    }

    /* renamed from: W */
    public void mo24860W() {
        m37192X(this.f29082y0, this.f29084z0);
    }

    /* renamed from: Y */
    public void mo24861Y() {
        m37192X(this.f29041c0, this.f29042d0);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f29045g.addView(view, layoutParams2);
            this.f29045g.setLayoutParams(layoutParams);
            m37229u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f29053k;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f29055l != null) {
            boolean z = this.f29014I;
            this.f29014I = false;
            CharSequence hint = editText.getHint();
            this.f29053k.setHint(this.f29055l);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f29053k.setHint(hint);
                this.f29014I = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f29045g.getChildCount());
            for (int i2 = 0; i2 < this.f29045g.getChildCount(); i2++) {
                View childAt = this.f29045g.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f29053k) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f29033R0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f29033R0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m37179E(canvas);
        m37177D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f29031Q0) {
            boolean z = true;
            this.f29031Q0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C6061a aVar = this.f29023M0;
            boolean z0 = aVar != null ? aVar.mo24161z0(drawableState) | false : false;
            if (this.f29053k != null) {
                if (!C3774v.m16181T(this) || !isEnabled()) {
                    z = false;
                }
                mo25011v0(z);
            }
            mo24925s0();
            mo24853F0();
            if (z0) {
                invalidate();
            }
            this.f29031Q0 = false;
        }
    }

    /* renamed from: e */
    public void mo24867e(C6222f fVar) {
        this.f29054k0.add(fVar);
        if (this.f29053k != null) {
            fVar.mo25025a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo24868e0(TextView textView, int i) {
        boolean z = true;
        try {
            C0556l.m3435q(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0556l.m3435q(textView, C7499k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0506a.m3150b(getContext(), C7491c.design_error));
        }
    }

    /* renamed from: f */
    public void mo24869f(C6223g gVar) {
        this.f29062o0.add(gVar);
    }

    public int getBaseline() {
        EditText editText = this.f29053k;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m37230v();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C7541h getBoxBackground() {
        int i = this.f29026O;
        if (i == 1 || i == 2) {
            return this.f29016J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f29036U;
    }

    public int getBoxBackgroundMode() {
        return this.f29026O;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f29016J.mo28485s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f29016J.mo28486t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f29016J.mo28453J();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f29016J.mo28452I();
    }

    public int getBoxStrokeColor() {
        return this.f29007E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f29009F0;
    }

    public int getBoxStrokeWidth() {
        return this.f29032R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f29034S;
    }

    public int getCounterMaxLength() {
        return this.f29065q;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f29063p || !this.f29067r || (textView = this.f29069s) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f28998A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f28998A;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f28999A0;
    }

    public EditText getEditText() {
        return this.f29053k;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f29060n0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f29060n0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f29056l0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f29060n0;
    }

    public CharSequence getError() {
        if (this.f29061o.mo25076x()) {
            return this.f29061o.mo25068n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f29061o.mo25067m();
    }

    public int getErrorCurrentTextColors() {
        return this.f29061o.mo25069o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f29082y0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f29061o.mo25069o();
    }

    public CharSequence getHelperText() {
        if (this.f29061o.mo25077y()) {
            return this.f29061o.mo25071q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f29061o.mo25072r();
    }

    public CharSequence getHint() {
        if (this.f29010G) {
            return this.f29012H;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f29023M0.mo24151s();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f29023M0.mo24156w();
    }

    public ColorStateList getHintTextColor() {
        return this.f29001B0;
    }

    public int getMaxWidth() {
        return this.f29059n;
    }

    public int getMinWidth() {
        return this.f29057m;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f29060n0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f29060n0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f29077w) {
            return this.f29075v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f29083z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f29081y;
    }

    public CharSequence getPrefixText() {
        return this.f29002C;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f29004D.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f29004D;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f29041c0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f29041c0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f29006E;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f29008F.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f29008F;
    }

    public Typeface getTypeface() {
        return this.f29040b0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo24919i(float f) {
        if (this.f29023M0.mo24117D() != f) {
            if (this.f29029P0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f29029P0 = valueAnimator;
                valueAnimator.setInterpolator(C7501a.f32700b);
                this.f29029P0.setDuration(167);
                this.f29029P0.addUpdateListener(new C6220d());
            }
            this.f29029P0.setFloatValues(new float[]{this.f29023M0.mo24117D(), f});
            this.f29029P0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo24920n0(int i) {
        boolean z = this.f29067r;
        int i2 = this.f29065q;
        if (i2 == -1) {
            this.f29069s.setText(String.valueOf(i));
            this.f29069s.setContentDescription((CharSequence) null);
            this.f29067r = false;
        } else {
            this.f29067r = i > i2;
            m37218o0(getContext(), this.f29069s, i, this.f29065q, this.f29067r);
            if (z != this.f29067r) {
                m37220p0();
            }
            this.f29069s.setText(C3679a.m15764c().mo12959j(getContext().getString(C7498j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f29065q)})));
        }
        if (this.f29053k != null && z != this.f29067r) {
            mo25011v0(false);
            mo24853F0();
            mo24925s0();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f29053k;
        if (editText != null) {
            Rect rect = this.f29037V;
            C6065c.m36465a(this, editText, rect);
            m37213l0(rect);
            if (this.f29010G) {
                this.f29023M0.mo24143m0(this.f29053k.getTextSize());
                int gravity = this.f29053k.getGravity();
                this.f29023M0.mo24134c0((gravity & -113) | 48);
                this.f29023M0.mo24141l0(gravity);
                this.f29023M0.mo24130Y(m37223r(rect));
                this.f29023M0.mo24138h0(m37228u(rect));
                this.f29023M0.mo24127U();
                if (m37171A() && !this.f29021L0) {
                    m37190T();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean t0 = m37227t0();
        boolean r0 = m37224r0();
        if (t0 || r0) {
            this.f29053k.post(new C6219c());
        }
        m37234x0();
        m37172A0();
        m37178D0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        setError(savedState.f29085i);
        if (savedState.f29086j) {
            this.f29060n0.post(new C6218b());
        }
        setHint(savedState.f29087k);
        setHelperText(savedState.f29088l);
        setPlaceholderText(savedState.f29089m);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f29061o.mo25066k()) {
            savedState.f29085i = getError();
        }
        savedState.f29086j = m37184I() && this.f29060n0.isChecked();
        savedState.f29087k = getHint();
        savedState.f29088l = getHelperText();
        savedState.f29089m = getPlaceholderText();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo24925s0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f29053k;
        if (editText != null && this.f29026O == 0 && (background = editText.getBackground()) != null) {
            if (C0303p.m1828a(background)) {
                background = background.mutate();
            }
            if (this.f29061o.mo25066k()) {
                background.setColorFilter(C0275f.m1605e(this.f29061o.mo25069o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f29067r || (textView = this.f29069s) == null) {
                C0534a.m3277c(background);
                this.f29053k.refreshDrawableState();
            } else {
                background.setColorFilter(C0275f.m1605e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f29036U != i) {
            this.f29036U = i;
            this.f29011G0 = i;
            this.f29015I0 = i;
            this.f29017J0 = i;
            m37208j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0506a.m3150b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f29011G0 = defaultColor;
        this.f29036U = defaultColor;
        this.f29013H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f29015I0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f29017J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m37208j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f29026O) {
            this.f29026O = i;
            if (this.f29053k != null) {
                m37189S();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f29007E0 != i) {
            this.f29007E0 = i;
            mo24853F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f29003C0 = colorStateList.getDefaultColor();
            this.f29019K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f29005D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f29007E0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f29007E0 != colorStateList.getDefaultColor()) {
            this.f29007E0 = colorStateList.getDefaultColor();
        }
        mo24853F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f29009F0 != colorStateList) {
            this.f29009F0 = colorStateList;
            mo24853F0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f29032R = i;
        mo24853F0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f29034S = i;
        mo24853F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f29063p != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f29069s = appCompatTextView;
                appCompatTextView.setId(C7494f.textinput_counter);
                Typeface typeface = this.f29040b0;
                if (typeface != null) {
                    this.f29069s.setTypeface(typeface);
                }
                this.f29069s.setMaxLines(1);
                this.f29061o.mo25063d(this.f29069s, 2);
                C3760h.m16097e((ViewGroup.MarginLayoutParams) this.f29069s.getLayoutParams(), getResources().getDimensionPixelOffset(C7492d.mtrl_textinput_counter_margin_start));
                m37220p0();
                m37215m0();
            } else {
                this.f29061o.mo25078z(this.f29069s, 2);
                this.f29069s = null;
            }
            this.f29063p = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f29065q != i) {
            if (i > 0) {
                this.f29065q = i;
            } else {
                this.f29065q = -1;
            }
            if (this.f29063p) {
                m37215m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f29071t != i) {
            this.f29071t = i;
            m37220p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f29000B != colorStateList) {
            this.f29000B = colorStateList;
            m37220p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f29073u != i) {
            this.f29073u = i;
            m37220p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f28998A != colorStateList) {
            this.f28998A = colorStateList;
            m37220p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f28999A0 = colorStateList;
        this.f29001B0 = colorStateList;
        if (this.f29053k != null) {
            mo25011v0(false);
        }
    }

    public void setEnabled(boolean z) {
        m37191U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f29060n0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f29060n0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f29056l0;
        this.f29056l0 = i;
        m37175C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo25043b(this.f29026O)) {
            getEndIconDelegate().mo25027a();
            m37214m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f29026O + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m37199c0(this.f29060n0, onClickListener, this.f29078w0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f29078w0 = onLongClickListener;
        m37201d0(this.f29060n0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f29064p0 != colorStateList) {
            this.f29064p0 = colorStateList;
            this.f29066q0 = true;
            m37214m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f29068r0 != mode) {
            this.f29068r0 = mode;
            this.f29070s0 = true;
            m37214m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo24854K() != z) {
            this.f29060n0.setVisibility(z ? 0 : 8);
            m37178D0();
            m37224r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f29061o.mo25076x()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f29061o.mo25061M(charSequence);
        } else {
            this.f29061o.mo25073t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f29061o.mo25053B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f29061o.mo25054C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C3410a.m14543d(getContext(), i) : null);
        mo24860W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m37199c0(this.f29082y0, onClickListener, this.f29080x0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f29080x0 = onLongClickListener;
        m37201d0(this.f29082y0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f29084z0 = colorStateList;
        Drawable drawable = this.f29082y0.getDrawable();
        if (drawable != null) {
            drawable = C0534a.m3292r(drawable).mutate();
            C0534a.m3289o(drawable, colorStateList);
        }
        if (this.f29082y0.getDrawable() != drawable) {
            this.f29082y0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29082y0.getDrawable();
        if (drawable != null) {
            drawable = C0534a.m3292r(drawable).mutate();
            C0534a.m3290p(drawable, mode);
        }
        if (this.f29082y0.getDrawable() != drawable) {
            this.f29082y0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f29061o.mo25055D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f29061o.mo25056E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f29025N0 != z) {
            this.f29025N0 = z;
            mo25011v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo24855M()) {
                setHelperTextEnabled(true);
            }
            this.f29061o.mo25062N(charSequence);
        } else if (mo24855M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f29061o.mo25059H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f29061o.mo25058G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f29061o.mo25057F(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f29010G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f29027O0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f29010G) {
            this.f29010G = z;
            if (!z) {
                this.f29014I = false;
                if (!TextUtils.isEmpty(this.f29012H) && TextUtils.isEmpty(this.f29053k.getHint())) {
                    this.f29053k.setHint(this.f29012H);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f29053k.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f29012H)) {
                        setHint(hint);
                    }
                    this.f29053k.setHint((CharSequence) null);
                }
                this.f29014I = true;
            }
            if (this.f29053k != null) {
                m37229u0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f29023M0.mo24131Z(i);
        this.f29001B0 = this.f29023M0.mo24147q();
        if (this.f29053k != null) {
            mo25011v0(false);
            m37229u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f29001B0 != colorStateList) {
            if (this.f28999A0 == null) {
                this.f29023M0.mo24132b0(colorStateList);
            }
            this.f29001B0 = colorStateList;
            if (this.f29053k != null) {
                mo25011v0(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.f29059n = i;
        EditText editText = this.f29053k;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.f29057m = i;
        EditText editText = this.f29053k;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f29056l0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f29064p0 = colorStateList;
        this.f29066q0 = true;
        m37214m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f29068r0 = mode;
        this.f29070s0 = true;
        m37214m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f29077w || !TextUtils.isEmpty(charSequence)) {
            if (!this.f29077w) {
                setPlaceholderTextEnabled(true);
            }
            this.f29075v = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m37236y0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f29083z = i;
        TextView textView = this.f29079x;
        if (textView != null) {
            C0556l.m3435q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f29081y != colorStateList) {
            this.f29081y = colorStateList;
            TextView textView = this.f29079x;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f29002C = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f29004D.setText(charSequence);
        m37174B0();
    }

    public void setPrefixTextAppearance(int i) {
        C0556l.m3435q(this.f29004D, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f29004D.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f29041c0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m37199c0(this.f29041c0, onClickListener, this.f29052j0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f29052j0 = onLongClickListener;
        m37201d0(this.f29041c0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f29042d0 != colorStateList) {
            this.f29042d0 = colorStateList;
            this.f29043e0 = true;
            m37217o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f29044f0 != mode) {
            this.f29044f0 = mode;
            this.f29046g0 = true;
            m37217o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo24858Q() != z) {
            this.f29041c0.setVisibility(z ? 0 : 8);
            m37172A0();
            m37224r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f29006E = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f29008F.setText(charSequence);
        m37180E0();
    }

    public void setSuffixTextAppearance(int i) {
        C0556l.m3435q(this.f29008F, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f29008F.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C6221e eVar) {
        EditText editText = this.f29053k;
        if (editText != null) {
            C3774v.m16217o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f29040b0) {
            this.f29040b0 = typeface;
            this.f29023M0.mo24116C0(typeface);
            this.f29061o.mo25060J(typeface);
            TextView textView = this.f29069s;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo25011v0(boolean z) {
        m37232w0(z, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f29060n0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f29060n0.setImageDrawable(drawable);
        mo24859V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f29041c0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f29041c0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo24861Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r7 = r25
            r8 = r26
            int r9 = f28997S0
            r1 = r24
            android.content.Context r1 = com.google.android.material.theme.p249a.C6260a.m37386c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f29057m = r10
            r0.f29059n = r10
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f29061o = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f29037V = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f29038W = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f29039a0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f29054k0 = r1
            r11 = 0
            r0.f29056l0 = r11
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f29058m0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f29062o0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f29023M0 = r1
            android.content.Context r12 = r23.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.f29045g = r2
            r2.setAddStatesFromChildren(r13)
            r0.addView(r2)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r12)
            r0.f29047h = r3
            r3.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r14 = -2
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r4.<init>(r14, r10, r5)
            r3.setLayoutParams(r4)
            r2.addView(r3)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r12)
            r0.f29049i = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r14, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.f29051j = r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r14, r10)
            r2.setLayoutParams(r3)
            android.animation.TimeInterpolator r2 = p159f.p243f.p245b.p304b.p305m.C7501a.f32699a
            r1.mo24114B0(r2)
            r1.mo24158x0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo24134c0(r2)
            int[] r3 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout
            r1 = 5
            int[] r6 = new int[r1]
            int r5 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_counterTextAppearance
            r6[r11] = r5
            int r4 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_counterOverflowTextAppearance
            r6[r13] = r4
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorTextAppearance
            r1 = 2
            r6[r1] = r2
            int r14 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_helperTextTextAppearance
            r11 = 3
            r6[r11] = r14
            int r11 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_hintTextAppearance
            r16 = 4
            r6[r16] = r11
            r1 = r12
            r17 = r2
            r2 = r25
            r18 = r4
            r4 = r26
            r19 = r5
            r5 = r9
            androidx.appcompat.widget.g0 r1 = com.google.android.material.internal.C6093m.m36564i(r1, r2, r3, r4, r5, r6)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_hintEnabled
            boolean r2 = r1.mo1976a(r2, r13)
            r0.f29010G = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.mo1991p(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.mo1976a(r2, r13)
            r0.f29027O0 = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.mo1976a(r2, r13)
            r0.f29025N0 = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_android_minWidth
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x0117
            int r2 = r1.mo1981f(r2, r10)
            r0.setMinWidth(r2)
        L_0x0117:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_android_maxWidth
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x0126
            int r2 = r1.mo1981f(r2, r10)
            r0.setMaxWidth(r2)
        L_0x0126:
            f.f.b.b.w.m$b r2 = p159f.p243f.p245b.p304b.p315w.C7549m.m42149e(r12, r7, r8, r9)
            f.f.b.b.w.m r2 = r2.mo28526m()
            r0.f29020L = r2
            android.content.res.Resources r2 = r12.getResources()
            int r3 = p159f.p243f.p245b.p304b.C7492d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f29022M = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxCollapsedPaddingTop
            r3 = 0
            int r2 = r1.mo1980e(r2, r3)
            r0.f29028P = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r12.getResources()
            int r4 = p159f.p243f.p245b.p304b.C7492d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1981f(r2, r3)
            r0.f29032R = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r12.getResources()
            int r4 = p159f.p243f.p245b.p304b.C7492d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1981f(r2, r3)
            r0.f29034S = r2
            int r2 = r0.f29032R
            r0.f29030Q = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo1979d(r2, r3)
            int r4 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.mo1979d(r4, r3)
            int r5 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.mo1979d(r5, r3)
            int r6 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.mo1979d(r6, r3)
            f.f.b.b.w.m r6 = r0.f29020L
            f.f.b.b.w.m$b r6 = r6.mo28512v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0195
            r6.mo28520E(r2)
        L_0x0195:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x019c
            r6.mo28524I(r4)
        L_0x019c:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01a3
            r6.mo28538z(r5)
        L_0x01a3:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01aa
            r6.mo28534v(r3)
        L_0x01aa:
            f.f.b.b.w.m r2 = r6.mo28526m()
            r0.f29020L = r2
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            if (r2 == 0) goto L_0x0210
            int r3 = r2.getDefaultColor()
            r0.f29011G0 = r3
            r0.f29036U = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01ec
            int[] r3 = new int[r13]
            r5 = 0
            r3[r5] = r4
            int r3 = r2.getColorForState(r3, r10)
            r0.f29013H0 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r4 = {16842908, 16842910} // fill-array
            int r4 = r2.getColorForState(r4, r10)
            r0.f29015I0 = r4
            int[] r4 = new int[r3]
            r4 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r4, r10)
            r0.f29017J0 = r2
            goto L_0x021c
        L_0x01ec:
            r3 = 2
            int r2 = r0.f29011G0
            r0.f29015I0 = r2
            int r2 = p159f.p243f.p245b.p304b.C7491c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p082e.p083a.p084k.p085a.C3410a.m14542c(r12, r2)
            int[] r5 = new int[r13]
            r6 = 0
            r5[r6] = r4
            int r4 = r2.getColorForState(r5, r10)
            r0.f29013H0 = r4
            int[] r4 = new int[r13]
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r4[r6] = r5
            int r2 = r2.getColorForState(r4, r10)
            r0.f29017J0 = r2
            goto L_0x021c
        L_0x0210:
            r3 = 2
            r6 = 0
            r0.f29036U = r6
            r0.f29011G0 = r6
            r0.f29013H0 = r6
            r0.f29015I0 = r6
            r0.f29017J0 = r6
        L_0x021c:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_android_textColorHint
            boolean r4 = r1.mo1994s(r2)
            if (r4 == 0) goto L_0x022c
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.f29001B0 = r2
            r0.f28999A0 = r2
        L_0x022c:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            r5 = 0
            int r2 = r1.mo1977b(r2, r5)
            r0.f29007E0 = r2
            int r2 = p159f.p243f.p245b.p304b.C7491c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.C0506a.m3150b(r12, r2)
            r0.f29003C0 = r2
            int r2 = p159f.p243f.p245b.p304b.C7491c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.C0506a.m3150b(r12, r2)
            r0.f29019K0 = r2
            int r2 = p159f.p243f.p245b.p304b.C7491c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.C0506a.m3150b(r12, r2)
            r0.f29005D0 = r2
            if (r4 == 0) goto L_0x0256
            r0.setBoxStrokeColorStateList(r4)
        L_0x0256:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r1.mo1994s(r2)
            if (r4 == 0) goto L_0x0265
            android.content.res.ColorStateList r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0265:
            int r2 = r1.mo1989n(r11, r10)
            if (r2 == r10) goto L_0x0274
            r2 = 0
            int r4 = r1.mo1989n(r11, r2)
            r0.setHintTextAppearance(r4)
            goto L_0x0275
        L_0x0274:
            r2 = 0
        L_0x0275:
            r4 = r17
            int r4 = r1.mo1989n(r4, r2)
            int r5 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r1.mo1991p(r5)
            int r6 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorEnabled
            boolean r6 = r1.mo1976a(r6, r2)
            android.content.Context r7 = r23.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r8 = p159f.p243f.p245b.p304b.C7496h.design_text_input_end_icon
            android.view.View r7 = r7.inflate(r8, r15, r2)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r0.f29082y0 = r7
            int r9 = p159f.p243f.p245b.p304b.C7494f.text_input_error_icon
            r7.setId(r9)
            r9 = 8
            r7.setVisibility(r9)
            boolean r11 = p159f.p243f.p245b.p304b.p312t.C7522c.m42020g(r12)
            if (r11 == 0) goto L_0x02b2
            android.view.ViewGroup$LayoutParams r11 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            p082e.p109h.p119p.C3760h.m16097e(r11, r2)
        L_0x02b2:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorIconDrawable
            boolean r11 = r1.mo1994s(r2)
            if (r11 == 0) goto L_0x02c1
            android.graphics.drawable.Drawable r2 = r1.mo1982g(r2)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x02c1:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorIconTint
            boolean r11 = r1.mo1994s(r2)
            if (r11 == 0) goto L_0x02d0
            android.content.res.ColorStateList r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            r0.setErrorIconTintList(r2)
        L_0x02d0:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorIconTintMode
            boolean r11 = r1.mo1994s(r2)
            r15 = 0
            if (r11 == 0) goto L_0x02e4
            int r2 = r1.mo1986k(r2, r10)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C6100s.m36588i(r2, r15)
            r0.setErrorIconTintMode(r2)
        L_0x02e4:
            android.content.res.Resources r2 = r23.getResources()
            int r11 = p159f.p243f.p245b.p304b.C7498j.error_icon_content_description
            java.lang.CharSequence r2 = r2.getText(r11)
            r7.setContentDescription(r2)
            p082e.p109h.p119p.C3774v.m16237y0(r7, r3)
            r2 = 0
            r7.setClickable(r2)
            r7.setPressable(r2)
            r7.setFocusable(r2)
            int r7 = r1.mo1989n(r14, r2)
            int r11 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_helperTextEnabled
            boolean r11 = r1.mo1976a(r11, r2)
            int r14 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_helperText
            java.lang.CharSequence r14 = r1.mo1991p(r14)
            int r3 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_placeholderTextAppearance
            int r3 = r1.mo1989n(r3, r2)
            int r13 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_placeholderText
            java.lang.CharSequence r13 = r1.mo1991p(r13)
            int r15 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_prefixTextAppearance
            int r15 = r1.mo1989n(r15, r2)
            int r9 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_prefixText
            java.lang.CharSequence r9 = r1.mo1991p(r9)
            int r10 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_suffixTextAppearance
            int r10 = r1.mo1989n(r10, r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_suffixText
            java.lang.CharSequence r2 = r1.mo1991p(r2)
            r20 = r10
            int r10 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_counterEnabled
            r21 = r2
            r2 = 0
            boolean r10 = r1.mo1976a(r10, r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_counterMaxLength
            r22 = r10
            r10 = -1
            int r2 = r1.mo1986k(r2, r10)
            r0.setCounterMaxLength(r2)
            r2 = r19
            r10 = 0
            int r2 = r1.mo1989n(r2, r10)
            r0.f29073u = r2
            r2 = r18
            int r2 = r1.mo1989n(r2, r10)
            r0.f29071t = r2
            android.content.Context r2 = r23.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r18 = r15
            int r15 = p159f.p243f.p245b.p304b.C7496h.design_text_input_start_icon
            r19 = r9
            android.widget.LinearLayout r9 = r0.f29047h
            android.view.View r2 = r2.inflate(r15, r9, r10)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f29041c0 = r2
            r9 = 8
            r2.setVisibility(r9)
            boolean r9 = p159f.p243f.p245b.p304b.p312t.C7522c.m42020g(r12)
            if (r9 == 0) goto L_0x0386
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            p082e.p109h.p119p.C3760h.m16096d(r2, r10)
        L_0x0386:
            r2 = 0
            r0.setStartIconOnClickListener(r2)
            r0.setStartIconOnLongClickListener(r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_startIconDrawable
            boolean r9 = r1.mo1994s(r2)
            if (r9 == 0) goto L_0x03b5
            android.graphics.drawable.Drawable r2 = r1.mo1982g(r2)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_startIconContentDescription
            boolean r9 = r1.mo1994s(r2)
            if (r9 == 0) goto L_0x03ab
            java.lang.CharSequence r2 = r1.mo1991p(r2)
            r0.setStartIconContentDescription((java.lang.CharSequence) r2)
        L_0x03ab:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_startIconCheckable
            r9 = 1
            boolean r2 = r1.mo1976a(r2, r9)
            r0.setStartIconCheckable(r2)
        L_0x03b5:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_startIconTint
            boolean r9 = r1.mo1994s(r2)
            if (r9 == 0) goto L_0x03c4
            android.content.res.ColorStateList r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            r0.setStartIconTintList(r2)
        L_0x03c4:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_startIconTintMode
            boolean r9 = r1.mo1994s(r2)
            if (r9 == 0) goto L_0x03d9
            r9 = -1
            int r2 = r1.mo1986k(r2, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C6100s.m36588i(r2, r9)
            r0.setStartIconTintMode(r2)
        L_0x03d9:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_boxBackgroundMode
            r9 = 0
            int r2 = r1.mo1986k(r2, r9)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r23.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.widget.FrameLayout r10 = r0.f29051j
            android.view.View r2 = r2.inflate(r8, r10, r9)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f29060n0 = r2
            android.widget.FrameLayout r2 = r0.f29051j
            com.google.android.material.internal.CheckableImageButton r8 = r0.f29060n0
            r2.addView(r8)
            com.google.android.material.internal.CheckableImageButton r2 = r0.f29060n0
            r8 = 8
            r2.setVisibility(r8)
            boolean r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42020g(r12)
            if (r2 == 0) goto L_0x0416
            com.google.android.material.internal.CheckableImageButton r2 = r0.f29060n0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r8 = 0
            p082e.p109h.p119p.C3760h.m16097e(r2, r8)
            goto L_0x0417
        L_0x0416:
            r8 = 0
        L_0x0417:
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f29058m0
            com.google.android.material.textfield.b r9 = new com.google.android.material.textfield.b
            r9.<init>(r0)
            r10 = -1
            r2.append(r10, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f29058m0
            com.google.android.material.textfield.g r9 = new com.google.android.material.textfield.g
            r9.<init>(r0)
            r2.append(r8, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f29058m0
            com.google.android.material.textfield.h r8 = new com.google.android.material.textfield.h
            r8.<init>(r0)
            r9 = 1
            r2.append(r9, r8)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f29058m0
            com.google.android.material.textfield.a r8 = new com.google.android.material.textfield.a
            r8.<init>(r0)
            r9 = 2
            r2.append(r9, r8)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f29058m0
            com.google.android.material.textfield.d r8 = new com.google.android.material.textfield.d
            r8.<init>(r0)
            r9 = 3
            r2.append(r9, r8)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_endIconMode
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x0486
            r8 = 0
            int r2 = r1.mo1986k(r2, r8)
            r0.setEndIconMode(r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_endIconDrawable
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x046c
            android.graphics.drawable.Drawable r2 = r1.mo1982g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x046c:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_endIconContentDescription
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x047b
            java.lang.CharSequence r2 = r1.mo1991p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x047b:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_endIconCheckable
            r8 = 1
            boolean r2 = r1.mo1976a(r2, r8)
            r0.setEndIconCheckable(r2)
            goto L_0x04cc
        L_0x0486:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_passwordToggleEnabled
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x04cc
            r8 = 0
            boolean r2 = r1.mo1976a(r2, r8)
            r0.setEndIconMode(r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r2 = r1.mo1982g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.mo1991p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_passwordToggleTint
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x04b7
            android.content.res.ColorStateList r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04b7:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_passwordToggleTintMode
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x04cc
            r8 = -1
            int r2 = r1.mo1986k(r2, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C6100s.m36588i(r2, r8)
            r0.setEndIconTintMode(r2)
        L_0x04cc:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.mo1994s(r2)
            if (r2 != 0) goto L_0x04f8
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_endIconTint
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x04e3
            android.content.res.ColorStateList r2 = p159f.p243f.p245b.p304b.p312t.C7522c.m42015b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04e3:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_endIconTintMode
            boolean r8 = r1.mo1994s(r2)
            if (r8 == 0) goto L_0x04f8
            r8 = -1
            int r2 = r1.mo1986k(r2, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C6100s.m36588i(r2, r8)
            r0.setEndIconTintMode(r2)
        L_0x04f8:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r12)
            r0.f29004D = r2
            int r8 = p159f.p243f.p245b.p304b.C7494f.textinput_prefix_text
            r2.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r2.setLayoutParams(r8)
            r8 = 1
            p082e.p109h.p119p.C3774v.m16221q0(r2, r8)
            android.widget.LinearLayout r8 = r0.f29047h
            com.google.android.material.internal.CheckableImageButton r9 = r0.f29041c0
            r8.addView(r9)
            android.widget.LinearLayout r8 = r0.f29047h
            r8.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r12)
            r0.f29008F = r2
            int r8 = p159f.p243f.p245b.p304b.C7494f.textinput_suffix_text
            r2.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = 80
            r10 = -2
            r8.<init>(r10, r10, r9)
            r2.setLayoutParams(r8)
            r8 = 1
            p082e.p109h.p119p.C3774v.m16221q0(r2, r8)
            android.widget.LinearLayout r8 = r0.f29049i
            r8.addView(r2)
            android.widget.LinearLayout r2 = r0.f29049i
            com.google.android.material.internal.CheckableImageButton r8 = r0.f29082y0
            r2.addView(r8)
            android.widget.LinearLayout r2 = r0.f29049i
            android.widget.FrameLayout r8 = r0.f29051j
            r2.addView(r8)
            r0.setHelperTextEnabled(r11)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorEnabled(r6)
            r0.setErrorTextAppearance(r4)
            r0.setErrorContentDescription(r5)
            int r2 = r0.f29073u
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f29071t
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r3)
            r2 = r19
            r0.setPrefixText(r2)
            r2 = r18
            r0.setPrefixTextAppearance(r2)
            r2 = r21
            r0.setSuffixText(r2)
            r2 = r20
            r0.setSuffixTextAppearance(r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_errorTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x0590
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setErrorTextColor(r2)
        L_0x0590:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_helperTextTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x059f
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setHelperTextColor(r2)
        L_0x059f:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_hintTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x05ae
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setHintTextColor(r2)
        L_0x05ae:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_counterTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x05bd
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setCounterTextColor(r2)
        L_0x05bd:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_counterOverflowTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x05cc
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05cc:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_placeholderTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x05db
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05db:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_prefixTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x05ea
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05ea:
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_suffixTextColor
            boolean r3 = r1.mo1994s(r2)
            if (r3 == 0) goto L_0x05f9
            android.content.res.ColorStateList r2 = r1.mo1978c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05f9:
            r2 = r22
            r0.setCounterEnabled(r2)
            int r2 = p159f.p243f.p245b.p304b.C7500l.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.mo1976a(r2, r3)
            r0.setEnabled(r2)
            r1.mo1995w()
            r1 = 2
            p082e.p109h.p119p.C3774v.m16237y0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0618
            p082e.p109h.p119p.C3774v.m16239z0(r0, r3)
        L_0x0618:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f29082y0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f29061o.mo25076x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f29060n0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f29060n0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
