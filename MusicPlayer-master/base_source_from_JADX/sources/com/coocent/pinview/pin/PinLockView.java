package com.coocent.pinview.pin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.pinview.C2482f;
import com.coocent.pinview.C2490g;
import com.coocent.pinview.C2496m;
import com.coocent.pinview.pin.C2502c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class PinLockView extends RecyclerView {
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public String f8829R0 = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public int f8830S0;

    /* renamed from: T0 */
    private int f8831T0;

    /* renamed from: U0 */
    private int f8832U0;

    /* renamed from: V0 */
    private int f8833V0;

    /* renamed from: W0 */
    private int f8834W0;

    /* renamed from: X0 */
    private int f8835X0;

    /* renamed from: Y0 */
    private int f8836Y0;

    /* renamed from: Z0 */
    private int f8837Z0;

    /* renamed from: a1 */
    private Drawable f8838a1;

    /* renamed from: b1 */
    private Drawable f8839b1;

    /* renamed from: c1 */
    private boolean f8840c1;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public IndicatorDots f8841d1;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public C2502c f8842e1;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public C2511d f8843f1;

    /* renamed from: g1 */
    private C2500a f8844g1;

    /* renamed from: h1 */
    private int[] f8845h1;

    /* renamed from: i1 */
    private C2502c.C2510d f8846i1 = new C2497a();

    /* renamed from: j1 */
    private C2502c.C2509c f8847j1 = new C2498b();

    /* renamed from: com.coocent.pinview.pin.PinLockView$a */
    class C2497a implements C2502c.C2510d {
        C2497a() {
        }

        /* renamed from: a */
        public void mo9681a(int i) {
            if (PinLockView.this.f8829R0.length() < PinLockView.this.getPinLength()) {
                PinLockView pinLockView = PinLockView.this;
                String unused = pinLockView.f8829R0 = pinLockView.f8829R0.concat(String.valueOf(i));
                if (PinLockView.this.mo9658Q1()) {
                    PinLockView.this.f8841d1.mo9642d(PinLockView.this.f8829R0.length());
                }
                if (PinLockView.this.f8829R0.length() == 1) {
                    PinLockView.this.f8842e1.mo9704n(PinLockView.this.f8829R0.length());
                    PinLockView.this.f8842e1.notifyItemChanged(PinLockView.this.f8842e1.getItemCount() - 1);
                }
                if (PinLockView.this.f8843f1 == null) {
                    return;
                }
                if (PinLockView.this.f8829R0.length() == PinLockView.this.f8830S0) {
                    PinLockView.this.f8843f1.mo9605I0(PinLockView.this.f8829R0);
                } else {
                    PinLockView.this.f8843f1.mo9609t0(PinLockView.this.f8829R0.length(), PinLockView.this.f8829R0);
                }
            } else if (!PinLockView.this.mo9659R1()) {
                PinLockView.this.mo9660S1();
                PinLockView pinLockView2 = PinLockView.this;
                String unused2 = pinLockView2.f8829R0 = pinLockView2.f8829R0.concat(String.valueOf(i));
                if (PinLockView.this.mo9658Q1()) {
                    PinLockView.this.f8841d1.mo9642d(PinLockView.this.f8829R0.length());
                }
                if (PinLockView.this.f8843f1 != null) {
                    PinLockView.this.f8843f1.mo9609t0(PinLockView.this.f8829R0.length(), PinLockView.this.f8829R0);
                }
            } else if (PinLockView.this.f8843f1 != null) {
                PinLockView.this.f8843f1.mo9605I0(PinLockView.this.f8829R0);
            }
        }
    }

    /* renamed from: com.coocent.pinview.pin.PinLockView$b */
    class C2498b implements C2502c.C2509c {
        C2498b() {
        }

        /* renamed from: a */
        public void mo9682a() {
            if (PinLockView.this.f8829R0.length() > 0) {
                PinLockView pinLockView = PinLockView.this;
                String unused = pinLockView.f8829R0 = pinLockView.f8829R0.substring(0, PinLockView.this.f8829R0.length() - 1);
                if (PinLockView.this.mo9658Q1()) {
                    PinLockView.this.f8841d1.mo9642d(PinLockView.this.f8829R0.length());
                }
                if (PinLockView.this.f8829R0.length() == 0) {
                    PinLockView.this.f8842e1.mo9704n(PinLockView.this.f8829R0.length());
                    PinLockView.this.f8842e1.notifyItemChanged(PinLockView.this.f8842e1.getItemCount() - 1);
                }
                if (PinLockView.this.f8843f1 == null) {
                    return;
                }
                if (PinLockView.this.f8829R0.length() == 0) {
                    PinLockView.this.f8843f1.mo9610w1();
                    PinLockView.this.m11689N1();
                    return;
                }
                PinLockView.this.f8843f1.mo9609t0(PinLockView.this.f8829R0.length(), PinLockView.this.f8829R0);
            } else if (PinLockView.this.f8843f1 != null) {
                PinLockView.this.f8843f1.mo9610w1();
            }
        }

        /* renamed from: b */
        public void mo9683b() {
            PinLockView.this.mo9660S1();
            if (PinLockView.this.f8843f1 != null) {
                PinLockView.this.f8843f1.mo9610w1();
            }
        }
    }

    /* renamed from: com.coocent.pinview.pin.PinLockView$c */
    class C2499c extends LTRGridLayoutManager {
        C2499c(PinLockView pinLockView, Context context, int i) {
            super(context, i);
        }

        /* renamed from: l */
        public boolean mo4495l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo4496m() {
            return false;
        }
    }

    public PinLockView(Context context) {
        super(context);
        m11690O1((AttributeSet) null, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public void m11689N1() {
        this.f8829R0 = BuildConfig.FLAVOR;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: O1 */
    private void m11690O1(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2496m.PinLockView);
        try {
            this.f8830S0 = obtainStyledAttributes.getInt(C2496m.PinLockView_pinLength, 4);
            this.f8831T0 = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_keypadHorizontalSpacing, getResources().getDimension(C2490g.default_horizontal_spacing));
            this.f8832U0 = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_keypadVerticalSpacing, getResources().getDimension(C2490g.default_vertical_spacing));
            this.f8833V0 = obtainStyledAttributes.getColor(C2496m.PinLockView_keypadTextColor, C0506a.m3150b(getContext(), C2482f.white));
            this.f8835X0 = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_keypadTextSize, getResources().getDimension(C2490g.default_text_size));
            this.f8836Y0 = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_keypadButtonSize, getResources().getDimension(C2490g.default_button_size));
            this.f8837Z0 = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_keypadDeleteButtonSize, getResources().getDimension(C2490g.default_delete_button_size));
            this.f8838a1 = obtainStyledAttributes.getDrawable(C2496m.PinLockView_keypadButtonBackgroundDrawable);
            this.f8839b1 = obtainStyledAttributes.getDrawable(C2496m.PinLockView_keypadDeleteButtonDrawable);
            this.f8840c1 = obtainStyledAttributes.getBoolean(C2496m.PinLockView_keypadShowDeleteButton, true);
            this.f8834W0 = obtainStyledAttributes.getColor(C2496m.PinLockView_keypadDeleteButtonPressedColor, C0506a.m3150b(getContext(), C2482f.greyish));
            obtainStyledAttributes.recycle();
            C2500a aVar = new C2500a();
            this.f8844g1 = aVar;
            aVar.mo9698o(this.f8833V0);
            this.f8844g1.mo9699p(this.f8835X0);
            this.f8844g1.mo9693j(this.f8836Y0);
            this.f8844g1.mo9692i(this.f8838a1);
            this.f8844g1.mo9694k(this.f8839b1);
            this.f8844g1.mo9696m(this.f8837Z0);
            this.f8844g1.mo9697n(this.f8840c1);
            this.f8844g1.mo9695l(this.f8834W0);
            m11691P1();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: P1 */
    private void m11691P1() {
        setLayoutManager(new C2499c(this, getContext(), 3));
        C2502c cVar = new C2502c(getContext());
        this.f8842e1 = cVar;
        cVar.mo9703m(this.f8846i1);
        this.f8842e1.mo9702l(this.f8847j1);
        this.f8842e1.mo9700j(this.f8844g1);
        setAdapter(this.f8842e1);
        mo4622h(new C2501b(this.f8831T0, this.f8832U0, 3, false));
        setOverScrollMode(2);
    }

    /* renamed from: Q1 */
    public boolean mo9658Q1() {
        return this.f8841d1 != null;
    }

    /* renamed from: R1 */
    public boolean mo9659R1() {
        return this.f8840c1;
    }

    /* renamed from: S1 */
    public void mo9660S1() {
        m11689N1();
        this.f8842e1.mo9704n(this.f8829R0.length());
        C2502c cVar = this.f8842e1;
        cVar.notifyItemChanged(cVar.getItemCount() - 1);
        IndicatorDots indicatorDots = this.f8841d1;
        if (indicatorDots != null) {
            indicatorDots.mo9642d(this.f8829R0.length());
        }
    }

    public Drawable getButtonBackgroundDrawable() {
        return this.f8838a1;
    }

    public int getButtonSize() {
        return this.f8836Y0;
    }

    public int[] getCustomKeySet() {
        return this.f8845h1;
    }

    public Drawable getDeleteButtonDrawable() {
        return this.f8839b1;
    }

    public int getDeleteButtonPressedColor() {
        return this.f8834W0;
    }

    public int getDeleteButtonSize() {
        return this.f8837Z0;
    }

    public int getPinLength() {
        return this.f8830S0;
    }

    public int getTextColor() {
        return this.f8833V0;
    }

    public int getTextSize() {
        return this.f8835X0;
    }

    public void setButtonBackgroundDrawable(Drawable drawable) {
        this.f8838a1 = drawable;
        this.f8844g1.mo9692i(drawable);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setButtonSize(int i) {
        this.f8836Y0 = i;
        this.f8844g1.mo9693j(i);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setCustomKeySet(int[] iArr) {
        this.f8845h1 = iArr;
        C2502c cVar = this.f8842e1;
        if (cVar != null) {
            cVar.mo9701k(iArr);
        }
    }

    public void setDeleteButtonDrawable(Drawable drawable) {
        this.f8839b1 = drawable;
        this.f8844g1.mo9694k(drawable);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setDeleteButtonPressedColor(int i) {
        this.f8834W0 = i;
        this.f8844g1.mo9695l(i);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setDeleteButtonSize(int i) {
        this.f8837Z0 = i;
        this.f8844g1.mo9696m(i);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setPinLength(int i) {
        this.f8830S0 = i;
        if (mo9658Q1()) {
            this.f8841d1.setPinLength(i);
        }
    }

    public void setPinLockListener(C2511d dVar) {
        this.f8843f1 = dVar;
    }

    public void setShowDeleteButton(boolean z) {
        this.f8840c1 = z;
        this.f8844g1.mo9697n(z);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setTextColor(int i) {
        this.f8833V0 = i;
        this.f8844g1.mo9698o(i);
        this.f8842e1.notifyDataSetChanged();
    }

    public void setTextSize(int i) {
        this.f8835X0 = i;
        this.f8844g1.mo9699p(i);
        this.f8842e1.notifyDataSetChanged();
    }

    public PinLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11690O1(attributeSet, 0);
    }

    public PinLockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11690O1(attributeSet, i);
    }
}
