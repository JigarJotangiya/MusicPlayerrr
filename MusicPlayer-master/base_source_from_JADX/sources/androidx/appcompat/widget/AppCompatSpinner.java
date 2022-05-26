package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.view.menu.C0191p;
import p082e.p083a.C3400a;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3772t;
import p082e.p109h.p119p.C3774v;

public class AppCompatSpinner extends Spinner implements C3772t {

    /* renamed from: o */
    private static final int[] f950o = {16843505};

    /* renamed from: g */
    private final C0271d f951g;

    /* renamed from: h */
    private final Context f952h;

    /* renamed from: i */
    private C0309s f953i;

    /* renamed from: j */
    private SpinnerAdapter f954j;

    /* renamed from: k */
    private final boolean f955k;

    /* renamed from: l */
    private C0230f f956l;

    /* renamed from: m */
    int f957m;

    /* renamed from: n */
    final Rect f958n;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0221a();

        /* renamed from: g */
        boolean f959g;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0221a implements Parcelable.Creator<SavedState> {
            C0221a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f959g ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f959g = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0222a extends C0309s {

        /* renamed from: p */
        final /* synthetic */ C0226e f960p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0222a(View view, C0226e eVar) {
            super(view);
            this.f960p = eVar;
        }

        /* renamed from: b */
        public C0191p mo737b() {
            return this.f960p;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: d */
        public boolean mo738d() {
            if (AppCompatSpinner.this.getInternalPopup().mo1483a()) {
                return true;
            }
            AppCompatSpinner.this.mo1452b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class C0223b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0223b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1483a()) {
                AppCompatSpinner.this.mo1452b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class C0224c implements C0230f, DialogInterface.OnClickListener {

        /* renamed from: g */
        C0133c f963g;

        /* renamed from: h */
        private ListAdapter f964h;

        /* renamed from: i */
        private CharSequence f965i;

        C0224c() {
        }

        /* renamed from: a */
        public boolean mo1483a() {
            C0133c cVar = this.f963g;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public void mo1484c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: d */
        public int mo1485d() {
            return 0;
        }

        public void dismiss() {
            C0133c cVar = this.f963g;
            if (cVar != null) {
                cVar.dismiss();
                this.f963g = null;
            }
        }

        /* renamed from: f */
        public void mo1487f(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: g */
        public CharSequence mo1488g() {
            return this.f965i;
        }

        /* renamed from: i */
        public Drawable mo1489i() {
            return null;
        }

        /* renamed from: k */
        public void mo1490k(CharSequence charSequence) {
            this.f965i = charSequence;
        }

        /* renamed from: l */
        public void mo1491l(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo1492m(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: n */
        public void mo1493n(int i, int i2) {
            if (this.f964h != null) {
                C0133c.C0134a aVar = new C0133c.C0134a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f965i;
                if (charSequence != null) {
                    aVar.mo645p(charSequence);
                }
                aVar.mo643n(this.f964h, AppCompatSpinner.this.getSelectedItemPosition(), this);
                C0133c a = aVar.mo630a();
                this.f963g = a;
                ListView f = a.mo625f();
                if (Build.VERSION.SDK_INT >= 17) {
                    f.setTextDirection(i);
                    f.setTextAlignment(i2);
                }
                this.f963g.show();
            }
        }

        /* renamed from: o */
        public int mo1494o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f964h.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public void mo1496p(ListAdapter listAdapter) {
            this.f964h = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0225d implements ListAdapter, SpinnerAdapter {

        /* renamed from: g */
        private SpinnerAdapter f967g;

        /* renamed from: h */
        private ListAdapter f968h;

        public C0225d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f967g = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f968h = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0270c0) {
                C0270c0 c0Var = (C0270c0) spinnerAdapter;
                if (c0Var.getDropDownViewTheme() == null) {
                    c0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f968h;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f967g;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f967g;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f967g;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f967g;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f967g;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f968h;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f967g;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f967g;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0226e extends ListPopupWindow implements C0230f {

        /* renamed from: O */
        private CharSequence f969O;

        /* renamed from: P */
        ListAdapter f970P;

        /* renamed from: Q */
        private final Rect f971Q = new Rect();

        /* renamed from: R */
        private int f972R;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class C0227a implements AdapterView.OnItemClickListener {
            C0227a(AppCompatSpinner appCompatSpinner) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0226e eVar = C0226e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f970P.getItemId(i));
                }
                C0226e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class C0228b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0228b() {
            }

            public void onGlobalLayout() {
                C0226e eVar = C0226e.this;
                if (!eVar.mo1512U(AppCompatSpinner.this)) {
                    C0226e.this.dismiss();
                    return;
                }
                C0226e.this.mo1510S();
                C0226e.super.mo840b();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class C0229c implements PopupWindow.OnDismissListener {

            /* renamed from: g */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f976g;

            C0229c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f976g = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f976g);
                }
            }
        }

        public C0226e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1614D(AppCompatSpinner.this);
            mo1620J(true);
            mo1624O(0);
            mo1622L(new C0227a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: S */
        public void mo1510S() {
            int i;
            int i2;
            Drawable i3 = mo1630i();
            int i4 = 0;
            if (i3 != null) {
                i3.getPadding(AppCompatSpinner.this.f958n);
                if (C0299m0.m1793b(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f958n.right;
                } else {
                    i2 = -AppCompatSpinner.this.f958n.left;
                }
                i4 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f958n;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i5 = appCompatSpinner.f957m;
            if (i5 == -2) {
                int a = appCompatSpinner.mo1451a((SpinnerAdapter) this.f970P, mo1630i());
                int i6 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f958n;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (a > i7) {
                    a = i7;
                }
                mo1616F(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i5 == -1) {
                mo1616F((width - paddingLeft) - paddingRight);
            } else {
                mo1616F(i5);
            }
            if (C0299m0.m1793b(AppCompatSpinner.this)) {
                i = i4 + (((width - paddingRight) - mo1640z()) - mo1511T());
            } else {
                i = i4 + paddingLeft + mo1511T();
            }
            mo1629f(i);
        }

        /* renamed from: T */
        public int mo1511T() {
            return this.f972R;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean mo1512U(View view) {
            return C3774v.m16180S(view) && view.getGlobalVisibleRect(this.f971Q);
        }

        /* renamed from: g */
        public CharSequence mo1488g() {
            return this.f969O;
        }

        /* renamed from: k */
        public void mo1490k(CharSequence charSequence) {
            this.f969O = charSequence;
        }

        /* renamed from: m */
        public void mo1492m(int i) {
            this.f972R = i;
        }

        /* renamed from: n */
        public void mo1493n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a = mo839a();
            mo1510S();
            mo1619I(2);
            super.mo840b();
            ListView j = mo845j();
            j.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                j.setTextDirection(i);
                j.setTextAlignment(i2);
            }
            mo1625P(AppCompatSpinner.this.getSelectedItemPosition());
            if (!a && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0228b bVar = new C0228b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo1621K(new C0229c(bVar));
            }
        }

        /* renamed from: p */
        public void mo1496p(ListAdapter listAdapter) {
            super.mo1496p(listAdapter);
            this.f970P = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface C0230f {
        /* renamed from: a */
        boolean mo1483a();

        /* renamed from: c */
        void mo1484c(Drawable drawable);

        /* renamed from: d */
        int mo1485d();

        void dismiss();

        /* renamed from: f */
        void mo1487f(int i);

        /* renamed from: g */
        CharSequence mo1488g();

        /* renamed from: i */
        Drawable mo1489i();

        /* renamed from: k */
        void mo1490k(CharSequence charSequence);

        /* renamed from: l */
        void mo1491l(int i);

        /* renamed from: m */
        void mo1492m(int i);

        /* renamed from: n */
        void mo1493n(int i, int i2);

        /* renamed from: o */
        int mo1494o();

        /* renamed from: p */
        void mo1496p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1451a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f958n);
        Rect rect = this.f958n;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1452b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f956l.mo1493n(getTextDirection(), getTextAlignment());
        } else {
            this.f956l.mo1493n(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f951g;
        if (dVar != null) {
            dVar.mo1944b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            return fVar.mo1485d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            return fVar.mo1494o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f956l != null) {
            return this.f957m;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0230f getInternalPopup() {
        return this.f956l;
    }

    public Drawable getPopupBackground() {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            return fVar.mo1489i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f952h;
    }

    public CharSequence getPrompt() {
        C0230f fVar = this.f956l;
        return fVar != null ? fVar.mo1488g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f951g;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f951g;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0230f fVar = this.f956l;
        if (fVar != null && fVar.mo1483a()) {
            this.f956l.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f956l != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1451a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f959g && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0223b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0230f fVar = this.f956l;
        savedState.f959g = fVar != null && fVar.mo1483a();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0309s sVar = this.f953i;
        if (sVar == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0230f fVar = this.f956l;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo1483a()) {
            return true;
        }
        mo1452b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f951g;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f951g;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            fVar.mo1492m(i);
            this.f956l.mo1487f(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            fVar.mo1491l(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f956l != null) {
            this.f957m = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            fVar.mo1484c(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C3410a.m14543d(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0230f fVar = this.f956l;
        if (fVar != null) {
            fVar.mo1490k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f951g;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f951g;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.spinnerStyle);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f955k) {
            this.f954j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f956l != null) {
            Context context = this.f952h;
            if (context == null) {
                context = getContext();
            }
            this.f956l.mo1496p(new C0225d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r11 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r11 != null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f958n = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0268b0.m1570a(r6, r0)
            int[] r0 = p082e.p083a.C3409j.Spinner
            r1 = 0
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.C0279g0.m1627v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r6)
            r6.f951g = r2
            if (r11 == 0) goto L_0x0029
            e.a.o.d r2 = new e.a.o.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f952h = r2
            goto L_0x003b
        L_0x0029:
            int r11 = p082e.p083a.C3409j.Spinner_popupTheme
            int r11 = r0.mo1989n(r11, r1)
            if (r11 == 0) goto L_0x0039
            e.a.o.d r2 = new e.a.o.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f952h = r2
            goto L_0x003b
        L_0x0039:
            r6.f952h = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006d
            int[] r11 = f950o     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0055 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0055 }
        L_0x004f:
            if (r11 == 0) goto L_0x006d
        L_0x0051:
            r11.recycle()
            goto L_0x006d
        L_0x0055:
            r3 = move-exception
            goto L_0x005b
        L_0x0057:
            r7 = move-exception
            goto L_0x0067
        L_0x0059:
            r3 = move-exception
            r11 = r2
        L_0x005b:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0065 }
            if (r11 == 0) goto L_0x006d
            goto L_0x0051
        L_0x0065:
            r7 = move-exception
            r2 = r11
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.recycle()
        L_0x006c:
            throw r7
        L_0x006d:
            r11 = 1
            if (r10 == 0) goto L_0x00aa
            if (r10 == r11) goto L_0x0073
            goto L_0x00ba
        L_0x0073:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.f952h
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f952h
            int[] r4 = p082e.p083a.C3409j.Spinner
            androidx.appcompat.widget.g0 r1 = androidx.appcompat.widget.C0279g0.m1627v(r3, r8, r4, r9, r1)
            int r3 = p082e.p083a.C3409j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo1988m(r3, r4)
            r6.f957m = r3
            int r3 = p082e.p083a.C3409j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo1982g(r3)
            r10.mo1627c(r3)
            int r3 = p082e.p083a.C3409j.Spinner_android_prompt
            java.lang.String r3 = r0.mo1990o(r3)
            r10.mo1490k(r3)
            r1.mo1995w()
            r6.f956l = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f953i = r1
            goto L_0x00ba
        L_0x00aa:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.f956l = r10
            int r1 = p082e.p083a.C3409j.Spinner_android_prompt
            java.lang.String r1 = r0.mo1990o(r1)
            r10.mo1490k(r1)
        L_0x00ba:
            int r10 = p082e.p083a.C3409j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo1992q(r10)
            if (r10 == 0) goto L_0x00d2
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p082e.p083a.C3406g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d2:
            r0.mo1995w()
            r6.f955k = r11
            android.widget.SpinnerAdapter r7 = r6.f954j
            if (r7 == 0) goto L_0x00e0
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f954j = r2
        L_0x00e0:
            androidx.appcompat.widget.d r7 = r6.f951g
            r7.mo1947e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
