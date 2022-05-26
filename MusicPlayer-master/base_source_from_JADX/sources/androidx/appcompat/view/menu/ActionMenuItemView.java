package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0285i0;
import androidx.appcompat.widget.C0309s;
import p082e.p083a.C3409j;

public class ActionMenuItemView extends AppCompatTextView implements C0188n.C0189a, View.OnClickListener, ActionMenuView.C0210a {

    /* renamed from: k */
    C0175i f558k;

    /* renamed from: l */
    private CharSequence f559l;

    /* renamed from: m */
    private Drawable f560m;

    /* renamed from: n */
    C0171g.C0173b f561n;

    /* renamed from: o */
    private C0309s f562o;

    /* renamed from: p */
    C0158b f563p;

    /* renamed from: q */
    private boolean f564q;

    /* renamed from: r */
    private boolean f565r;

    /* renamed from: s */
    private int f566s;

    /* renamed from: t */
    private int f567t;

    /* renamed from: u */
    private int f568u;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0157a extends C0309s {
        public C0157a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0191p mo737b() {
            C0158b bVar = ActionMenuItemView.this.f563p;
            if (bVar != null) {
                return bVar.mo739a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo738d() {
            C0191p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0171g.C0173b bVar = actionMenuItemView.f561n;
            if (bVar == null || !bVar.mo740a(actionMenuItemView.f558k) || (b = mo737b()) == null || !b.mo839a()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0158b {
        /* renamed from: a */
        public abstract C0191p mo739a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: q */
    private boolean m892q() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: r */
    private void m893r() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f559l);
        if (this.f560m != null && (!this.f558k.mo964B() || (!this.f564q && !this.f565r))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f559l : null);
        CharSequence contentDescription = this.f558k.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f558k.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f558k.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f558k.getTitle();
            }
            C0285i0.m1700a(this, charSequence2);
            return;
        }
        C0285i0.m1700a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo718a() {
        return mo728p();
    }

    /* renamed from: b */
    public boolean mo719b() {
        return mo728p() && this.f558k.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo720d() {
        return true;
    }

    public C0175i getItemData() {
        return this.f558k;
    }

    /* renamed from: n */
    public void mo722n(C0175i iVar, int i) {
        this.f558k = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo982i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f562o == null) {
            this.f562o = new C0157a();
        }
    }

    public void onClick(View view) {
        C0171g.C0173b bVar = this.f561n;
        if (bVar != null) {
            bVar.mo740a(this.f558k);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f564q = m892q();
        m893r();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean p = mo728p();
        if (p && (i4 = this.f567t) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f566s);
        } else {
            i3 = this.f566s;
        }
        if (mode != 1073741824 && this.f566s > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!p && this.f560m != null) {
            super.setPadding((getMeasuredWidth() - this.f560m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0309s sVar;
        if (!this.f558k.hasSubMenu() || (sVar = this.f562o) == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo728p() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f565r != z) {
            this.f565r = z;
            C0175i iVar = this.f558k;
            if (iVar != null) {
                iVar.mo965c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f560m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f568u;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m893r();
    }

    public void setItemInvoker(C0171g.C0173b bVar) {
        this.f561n = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f567t = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0158b bVar) {
        this.f563p = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f559l = charSequence;
        m893r();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f564q = m892q();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.ActionMenuItemView, i, 0);
        this.f566s = obtainStyledAttributes.getDimensionPixelSize(C3409j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f568u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f567t = -1;
        setSaveEnabled(false);
    }
}
