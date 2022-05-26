package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0191p;
import p082e.p083a.C3403d;
import p082e.p083a.C3405f;
import p082e.p083a.C3406g;
import p082e.p083a.C3407h;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3707b;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: g */
    final C0219f f895g;

    /* renamed from: h */
    private final C0220g f896h;

    /* renamed from: i */
    private final View f897i;

    /* renamed from: j */
    private final Drawable f898j;

    /* renamed from: k */
    final FrameLayout f899k;

    /* renamed from: l */
    private final ImageView f900l;

    /* renamed from: m */
    final FrameLayout f901m;

    /* renamed from: n */
    private final ImageView f902n;

    /* renamed from: o */
    private final int f903o;

    /* renamed from: p */
    C3707b f904p;

    /* renamed from: q */
    final DataSetObserver f905q;

    /* renamed from: r */
    private final ViewTreeObserver.OnGlobalLayoutListener f906r;

    /* renamed from: s */
    private ListPopupWindow f907s;

    /* renamed from: t */
    PopupWindow.OnDismissListener f908t;

    /* renamed from: u */
    boolean f909u;

    /* renamed from: v */
    int f910v;

    /* renamed from: w */
    private boolean f911w;

    /* renamed from: x */
    private int f912x;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: g */
        private static final int[] f913g = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0279g0 u = C0279g0.m1626u(context, attributeSet, f913g);
            setBackgroundDrawable(u.mo1982g(0));
            u.mo1995w();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    class C0214a extends DataSetObserver {
        C0214a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f895g.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f895g.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    class C0215b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0215b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.mo1316b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().mo840b();
            C3707b bVar = ActivityChooserView.this.f904p;
            if (bVar != null) {
                bVar.mo13012k(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    class C0216c extends View.AccessibilityDelegate {
        C0216c(ActivityChooserView activityChooserView) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C3736c.m15976I0(accessibilityNodeInfo).mo13108Z(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    class C0217d extends C0309s {
        C0217d(View view) {
            super(view);
        }

        /* renamed from: b */
        public C0191p mo737b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo738d() {
            ActivityChooserView.this.mo1317c();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public boolean mo1278f() {
            ActivityChooserView.this.mo1315a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    class C0218e extends DataSetObserver {
        C0218e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mo1319e();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    private class C0219f extends BaseAdapter {

        /* renamed from: g */
        private C0269c f918g;

        /* renamed from: h */
        private int f919h = 4;

        /* renamed from: i */
        private boolean f920i;

        /* renamed from: j */
        private boolean f921j;

        /* renamed from: k */
        private boolean f922k;

        C0219f() {
        }

        /* renamed from: a */
        public int mo1338a() {
            this.f918g.mo1939c();
            throw null;
        }

        /* renamed from: b */
        public C0269c mo1339b() {
            return this.f918g;
        }

        /* renamed from: c */
        public ResolveInfo mo1340c() {
            this.f918g.mo1940d();
            throw null;
        }

        /* renamed from: d */
        public boolean mo1341d() {
            return this.f920i;
        }

        /* renamed from: e */
        public void mo1342e(C0269c cVar) {
            C0269c b = ActivityChooserView.this.f895g.mo1339b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.f905q);
            }
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f905q);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            this.f918g.mo1939c();
            throw null;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            } else if (!this.f920i) {
                this.f918g.mo1940d();
                throw null;
            } else {
                this.f918g.mo1938b(i);
                throw null;
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            if (!this.f922k) {
                return 0;
            }
            getCount();
            throw null;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != C3405f.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C3406g.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C3405f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C3405f.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f920i || i != 0 || !this.f921j) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C3406g.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C3405f.title)).setText(ActivityChooserView.this.getContext().getString(C3407h.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    private class C0220g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        C0220g() {
        }

        /* renamed from: a */
        private void m1302a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f908t;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f901m) {
                activityChooserView.mo1315a();
                ActivityChooserView.this.f895g.mo1340c();
                throw null;
            } else if (view == activityChooserView.f899k) {
                activityChooserView.f909u = false;
                activityChooserView.mo1318d(activityChooserView.f910v);
                throw null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m1302a();
            C3707b bVar = ActivityChooserView.this.f904p;
            if (bVar != null) {
                bVar.mo13012k(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0219f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo1315a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f909u) {
                    if (!activityChooserView.f895g.mo1341d()) {
                        i++;
                    }
                    ActivityChooserView.this.f895g.mo1339b().mo1937a(i);
                    throw null;
                } else if (i > 0) {
                    activityChooserView.f895g.mo1339b().mo1941e(i);
                    throw null;
                }
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else {
                ActivityChooserView.this.mo1318d(Integer.MAX_VALUE);
                throw null;
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f901m) {
                activityChooserView.f895g.getCount();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo1315a() {
        if (!mo1316b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f906r);
        return true;
    }

    /* renamed from: b */
    public boolean mo1316b() {
        return getListPopupWindow().mo839a();
    }

    /* renamed from: c */
    public boolean mo1317c() {
        if (mo1316b() || !this.f911w) {
            return false;
        }
        this.f909u = false;
        mo1318d(this.f910v);
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1318d(int i) {
        if (this.f895g.mo1339b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f906r);
            int visibility = this.f901m.getVisibility();
            this.f895g.mo1338a();
            throw null;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1319e() {
        this.f895g.getCount();
        throw null;
    }

    public C0269c getDataModel() {
        return this.f895g.mo1339b();
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.f907s == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f907s = listPopupWindow;
            listPopupWindow.mo1496p(this.f895g);
            this.f907s.mo1614D(this);
            this.f907s.mo1620J(true);
            this.f907s.mo1622L(this.f896h);
            this.f907s.mo1621K(this.f896h);
        }
        return this.f907s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0269c b = this.f895g.mo1339b();
        if (b != null) {
            b.registerObserver(this.f905q);
        }
        this.f911w = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0269c b = this.f895g.mo1339b();
        if (b != null) {
            b.unregisterObserver(this.f905q);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f906r);
        }
        if (mo1316b()) {
            mo1315a();
        }
        this.f911w = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f897i.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1316b()) {
            mo1315a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f897i;
        if (this.f901m.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0269c cVar) {
        this.f895g.mo1342e(cVar);
        if (mo1316b()) {
            mo1315a();
            mo1317c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f912x = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f900l.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f900l.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f910v = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f908t = onDismissListener;
    }

    public void setProvider(C3707b bVar) {
        this.f904p = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f905q = new C0214a();
        this.f906r = new C0215b();
        this.f910v = 4;
        int[] iArr = C3409j.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C3774v.m16213m0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f910v = obtainStyledAttributes.getInt(C3409j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C3409j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C3406g.abc_activity_chooser_view, this, true);
        C0220g gVar = new C0220g();
        this.f896h = gVar;
        View findViewById = findViewById(C3405f.activity_chooser_view_content);
        this.f897i = findViewById;
        this.f898j = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C3405f.default_activity_button);
        this.f901m = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = C3405f.image;
        this.f902n = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C3405f.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0216c(this));
        frameLayout2.setOnTouchListener(new C0217d(frameLayout2));
        this.f899k = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f900l = imageView;
        imageView.setImageDrawable(drawable);
        C0219f fVar = new C0219f();
        this.f895g = fVar;
        fVar.registerDataSetObserver(new C0218e());
        Resources resources = context.getResources();
        this.f903o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3403d.abc_config_prefDialogWidth));
    }
}
