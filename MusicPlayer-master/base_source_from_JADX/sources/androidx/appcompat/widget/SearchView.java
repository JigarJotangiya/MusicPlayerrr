package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.un4seen.bass.BASS;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p082e.p083a.C3400a;
import p082e.p083a.C3403d;
import p082e.p083a.C3405f;
import p082e.p083a.C3406g;
import p082e.p083a.C3407h;
import p082e.p083a.C3409j;
import p082e.p083a.p090o.C3434c;
import p082e.p109h.p119p.C3774v;
import p082e.p122i.p123a.C3794a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class SearchView extends LinearLayoutCompat implements C3434c {

    /* renamed from: w0 */
    static final C0253n f1053w0 = (Build.VERSION.SDK_INT < 29 ? new C0253n() : null);

    /* renamed from: A */
    final ImageView f1054A;

    /* renamed from: B */
    final ImageView f1055B;

    /* renamed from: C */
    final ImageView f1056C;

    /* renamed from: D */
    private final View f1057D;

    /* renamed from: E */
    private C0254o f1058E;

    /* renamed from: F */
    private Rect f1059F;

    /* renamed from: G */
    private Rect f1060G;

    /* renamed from: H */
    private int[] f1061H;

    /* renamed from: I */
    private int[] f1062I;

    /* renamed from: J */
    private final ImageView f1063J;

    /* renamed from: K */
    private final Drawable f1064K;

    /* renamed from: L */
    private final int f1065L;

    /* renamed from: M */
    private final int f1066M;

    /* renamed from: N */
    private final Intent f1067N;

    /* renamed from: O */
    private final Intent f1068O;

    /* renamed from: P */
    private final CharSequence f1069P;

    /* renamed from: Q */
    private C0251l f1070Q;

    /* renamed from: R */
    private C0250k f1071R;

    /* renamed from: S */
    View.OnFocusChangeListener f1072S;

    /* renamed from: T */
    private C0252m f1073T;

    /* renamed from: U */
    private View.OnClickListener f1074U;

    /* renamed from: V */
    private boolean f1075V;

    /* renamed from: W */
    private boolean f1076W;

    /* renamed from: a0 */
    C3794a f1077a0;

    /* renamed from: b0 */
    private boolean f1078b0;

    /* renamed from: c0 */
    private CharSequence f1079c0;

    /* renamed from: d0 */
    private boolean f1080d0;

    /* renamed from: e0 */
    private boolean f1081e0;

    /* renamed from: f0 */
    private int f1082f0;

    /* renamed from: g0 */
    private boolean f1083g0;

    /* renamed from: h0 */
    private CharSequence f1084h0;

    /* renamed from: i0 */
    private CharSequence f1085i0;

    /* renamed from: j0 */
    private boolean f1086j0;

    /* renamed from: k0 */
    private int f1087k0;

    /* renamed from: l0 */
    SearchableInfo f1088l0;

    /* renamed from: m0 */
    private Bundle f1089m0;

    /* renamed from: n0 */
    private final Runnable f1090n0;

    /* renamed from: o0 */
    private Runnable f1091o0;

    /* renamed from: p0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1092p0;

    /* renamed from: q0 */
    private final View.OnClickListener f1093q0;

    /* renamed from: r0 */
    View.OnKeyListener f1094r0;

    /* renamed from: s0 */
    private final TextView.OnEditorActionListener f1095s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemClickListener f1096t0;

    /* renamed from: u0 */
    private final AdapterView.OnItemSelectedListener f1097u0;

    /* renamed from: v */
    final SearchAutoComplete f1098v;

    /* renamed from: v0 */
    private TextWatcher f1099v0;

    /* renamed from: w */
    private final View f1100w;

    /* renamed from: x */
    private final View f1101x;

    /* renamed from: y */
    private final View f1102y;

    /* renamed from: z */
    final ImageView f1103z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0238a();

        /* renamed from: i */
        boolean f1104i;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0238a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0238a() {
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
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1104i + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1104i));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1104i = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: j */
        private int f1105j;

        /* renamed from: k */
        private SearchView f1106k;

        /* renamed from: l */
        private boolean f1107l;

        /* renamed from: m */
        final Runnable f1108m;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0239a implements Runnable {
            C0239a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1706c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1704a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1053w0.mo1738c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1705b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1706c() {
            if (this.f1107l) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1107l = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1105j <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1107l) {
                removeCallbacks(this.f1108m);
                post(this.f1108m);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1106k.mo1662Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1106k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1106k.hasFocus() && getVisibility() == 0) {
                this.f1107l = true;
                if (SearchView.m1420M(getContext())) {
                    mo1704a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1107l = false;
                removeCallbacks(this.f1108m);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1107l = false;
                removeCallbacks(this.f1108m);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1107l = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1106k = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1105j = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C3400a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1108m = new C0239a();
            this.f1105j = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0240a implements TextWatcher {
        C0240a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1661Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0241b implements Runnable {
        C0241b() {
        }

        public void run() {
            SearchView.this.mo1666f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0242c implements Runnable {
        C0242c() {
        }

        public void run() {
            C3794a aVar = SearchView.this.f1077a0;
            if (aVar instanceof C0265a0) {
                aVar.mo1921a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0243d implements View.OnFocusChangeListener {
        C0243d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1072S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0244e implements View.OnLayoutChangeListener {
        C0244e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1650B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0245f implements View.OnClickListener {
        C0245f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1103z) {
                searchView.mo1658V();
            } else if (view == searchView.f1055B) {
                searchView.mo1654R();
            } else if (view == searchView.f1054A) {
                searchView.mo1659W();
            } else if (view == searchView.f1056C) {
                searchView.mo1663a0();
            } else if (view == searchView.f1098v) {
                searchView.mo1651H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0246g implements View.OnKeyListener {
        C0246g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1088l0 == null) {
                return false;
            }
            if (searchView.f1098v.isPopupShowing() && SearchView.this.f1098v.getListSelection() != -1) {
                return SearchView.this.mo1660X(view, i, keyEvent);
            }
            if (SearchView.this.f1098v.mo1705b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1653P(0, (String) null, searchView2.f1098v.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0247h implements TextView.OnEditorActionListener {
        C0247h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1659W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0248i implements AdapterView.OnItemClickListener {
        C0248i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1655S(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0249j implements AdapterView.OnItemSelectedListener {
        C0249j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1656T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0250k {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0251l {
        /* renamed from: a */
        boolean mo1732a(String str);

        /* renamed from: b */
        boolean mo1733b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0252m {
        /* renamed from: a */
        boolean mo1734a(int i);

        /* renamed from: b */
        boolean mo1735b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0253n {

        /* renamed from: a */
        private Method f1120a = null;

        /* renamed from: b */
        private Method f1121b = null;

        /* renamed from: c */
        private Method f1122c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0253n() {
            m1461d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1120a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1121b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1122c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1461d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1736a(AutoCompleteTextView autoCompleteTextView) {
            m1461d();
            Method method = this.f1121b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1737b(AutoCompleteTextView autoCompleteTextView) {
            m1461d();
            Method method = this.f1120a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1738c(AutoCompleteTextView autoCompleteTextView) {
            m1461d();
            Method method = this.f1122c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0254o extends TouchDelegate {

        /* renamed from: a */
        private final View f1123a;

        /* renamed from: b */
        private final Rect f1124b = new Rect();

        /* renamed from: c */
        private final Rect f1125c = new Rect();

        /* renamed from: d */
        private final Rect f1126d = new Rect();

        /* renamed from: e */
        private final int f1127e;

        /* renamed from: f */
        private boolean f1128f;

        public C0254o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1127e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1739a(rect, rect2);
            this.f1123a = view;
        }

        /* renamed from: a */
        public void mo1739a(Rect rect, Rect rect2) {
            this.f1124b.set(rect);
            this.f1126d.set(rect);
            Rect rect3 = this.f1126d;
            int i = this.f1127e;
            rect3.inset(-i, -i);
            this.f1125c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1128f
                r7.f1128f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1128f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1126d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1124b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1128f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1125c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1123a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1123a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1125c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1123a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0254o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: C */
    private Intent m1412C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1085i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1089m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1088l0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m1413D(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String x;
        try {
            String x2 = C0265a0.m1559x(cursor, "suggest_intent_action");
            if (x2 == null) {
                x2 = this.f1088l0.getSuggestIntentAction();
            }
            if (x2 == null) {
                x2 = "android.intent.action.SEARCH";
            }
            String str2 = x2;
            String x3 = C0265a0.m1559x(cursor, "suggest_intent_data");
            if (x3 == null) {
                x3 = this.f1088l0.getSuggestIntentData();
            }
            if (!(x3 == null || (x = C0265a0.m1559x(cursor, "suggest_intent_data_id")) == null)) {
                x3 = x3 + "/" + Uri.encode(x);
            }
            if (x3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(x3);
            }
            return m1412C(str2, uri, C0265a0.m1559x(cursor, "suggest_intent_extra_data"), C0265a0.m1559x(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m1414E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1089m0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m1415F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: G */
    private void m1416G() {
        this.f1098v.dismissDropDown();
    }

    /* renamed from: I */
    private void m1417I(View view, Rect rect) {
        view.getLocationInWindow(this.f1061H);
        getLocationInWindow(this.f1062I);
        int[] iArr = this.f1061H;
        int i = iArr[1];
        int[] iArr2 = this.f1062I;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m1418J(CharSequence charSequence) {
        if (!this.f1075V || this.f1064K == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1098v.getTextSize()) * 1.25d);
        this.f1064K.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1064K), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m1419K() {
        SearchableInfo searchableInfo = this.f1088l0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1088l0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1067N;
        } else if (this.f1088l0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1068O;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    static boolean m1420M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m1421N() {
        return (this.f1078b0 || this.f1083g0) && !mo1652L();
    }

    /* renamed from: O */
    private void m1422O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m1423Q(int i, int i2, String str) {
        Cursor b = this.f1077a0.mo13240b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m1422O(m1413D(b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m1424b0() {
        post(this.f1090n0);
    }

    /* renamed from: c0 */
    private void m1425c0(int i) {
        Editable text = this.f1098v.getText();
        Cursor b = this.f1077a0.mo13240b();
        if (b != null) {
            if (b.moveToPosition(i)) {
                CharSequence d = this.f1077a0.mo1922d(b);
                if (d != null) {
                    setQuery(d);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: e0 */
    private void m1426e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1098v.getText());
        int i = 0;
        if (!z2 && (!this.f1075V || this.f1086j0)) {
            z = false;
        }
        ImageView imageView = this.f1055B;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1055B.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m1427g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1098v;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(m1418J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C3403d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C3403d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m1428h0() {
        this.f1098v.setThreshold(this.f1088l0.getSuggestThreshold());
        this.f1098v.setImeOptions(this.f1088l0.getImeOptions());
        int inputType = this.f1088l0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1088l0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1098v.setInputType(inputType);
        C3794a aVar = this.f1077a0;
        if (aVar != null) {
            aVar.mo1921a((Cursor) null);
        }
        if (this.f1088l0.getSuggestAuthority() != null) {
            C0265a0 a0Var = new C0265a0(getContext(), this, this.f1088l0, this.f1092p0);
            this.f1077a0 = a0Var;
            this.f1098v.setAdapter(a0Var);
            C0265a0 a0Var2 = (C0265a0) this.f1077a0;
            if (this.f1080d0) {
                i = 2;
            }
            a0Var2.mo1920G(i);
        }
    }

    /* renamed from: i0 */
    private void m1429i0() {
        this.f1102y.setVisibility((!m1421N() || !(this.f1054A.getVisibility() == 0 || this.f1056C.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m1430j0(boolean z) {
        this.f1054A.setVisibility((!this.f1078b0 || !m1421N() || !hasFocus() || (!z && this.f1083g0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m1431k0(boolean z) {
        this.f1076W = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1098v.getText());
        this.f1103z.setVisibility(i2);
        m1430j0(z2);
        this.f1100w.setVisibility(z ? 8 : 0);
        if (this.f1063J.getDrawable() == null || this.f1075V) {
            i = 8;
        }
        this.f1063J.setVisibility(i);
        m1426e0();
        m1432l0(!z2);
        m1429i0();
    }

    /* renamed from: l0 */
    private void m1432l0(boolean z) {
        int i = 8;
        if (this.f1083g0 && !mo1652L() && z) {
            this.f1054A.setVisibility(8);
            i = 0;
        }
        this.f1056C.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1098v.setText(charSequence);
        this.f1098v.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1650B() {
        int i;
        if (this.f1057D.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1101x.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0299m0.m1793b(this);
            int dimensionPixelSize = this.f1075V ? resources.getDimensionPixelSize(C3403d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C3403d.abc_dropdownitem_text_padding_left) : 0;
            this.f1098v.getDropDownBackground().getPadding(rect);
            if (b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1098v.setDropDownHorizontalOffset(i);
            this.f1098v.setDropDownWidth((((this.f1057D.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1651H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1098v.refreshAutoCompleteResults();
            return;
        }
        C0253n nVar = f1053w0;
        nVar.mo1737b(this.f1098v);
        nVar.mo1736a(this.f1098v);
    }

    /* renamed from: L */
    public boolean mo1652L() {
        return this.f1076W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1653P(int i, String str, String str2) {
        getContext().startActivity(m1412C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1654R() {
        if (!TextUtils.isEmpty(this.f1098v.getText())) {
            this.f1098v.setText(BuildConfig.FLAVOR);
            this.f1098v.requestFocus();
            this.f1098v.setImeVisibility(true);
        } else if (this.f1075V) {
            C0250k kVar = this.f1071R;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                m1431k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1655S(int i, int i2, String str) {
        C0252m mVar = this.f1073T;
        if (mVar != null && mVar.mo1735b(i)) {
            return false;
        }
        m1423Q(i, 0, (String) null);
        this.f1098v.setImeVisibility(false);
        m1416G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1656T(int i) {
        C0252m mVar = this.f1073T;
        if (mVar != null && mVar.mo1734a(i)) {
            return false;
        }
        m1425c0(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1657U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1658V() {
        m1431k0(false);
        this.f1098v.requestFocus();
        this.f1098v.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1074U;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1659W() {
        Editable text = this.f1098v.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0251l lVar = this.f1070Q;
            if (lVar == null || !lVar.mo1733b(text.toString())) {
                if (this.f1088l0 != null) {
                    mo1653P(0, (String) null, text.toString());
                }
                this.f1098v.setImeVisibility(false);
                m1416G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1660X(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1088l0 != null && this.f1077a0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1655S(this.f1098v.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f1098v.length();
                }
                this.f1098v.setSelection(i2);
                this.f1098v.setListSelection(0);
                this.f1098v.clearListSelection();
                this.f1098v.mo1704a();
                return true;
            } else if (i != 19 || this.f1098v.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1661Y(CharSequence charSequence) {
        Editable text = this.f1098v.getText();
        this.f1085i0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1430j0(z);
        m1432l0(!z);
        m1426e0();
        m1429i0();
        if (this.f1070Q != null && !TextUtils.equals(charSequence, this.f1084h0)) {
            this.f1070Q.mo1732a(charSequence.toString());
        }
        this.f1084h0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1662Z() {
        m1431k0(mo1652L());
        m1424b0();
        if (this.f1098v.hasFocus()) {
            mo1651H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1663a0() {
        SearchableInfo searchableInfo = this.f1088l0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m1415F(this.f1067N, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m1414E(this.f1068O, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: c */
    public void mo1087c() {
        if (!this.f1086j0) {
            this.f1086j0 = true;
            int imeOptions = this.f1098v.getImeOptions();
            this.f1087k0 = imeOptions;
            this.f1098v.setImeOptions(imeOptions | BASS.BASS_SPEAKER_REAR);
            this.f1098v.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f1081e0 = true;
        super.clearFocus();
        this.f1098v.clearFocus();
        this.f1098v.setImeVisibility(false);
        this.f1081e0 = false;
    }

    /* renamed from: d0 */
    public void mo1665d0(CharSequence charSequence, boolean z) {
        this.f1098v.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1098v;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1085i0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1659W();
        }
    }

    /* renamed from: e */
    public void mo1088e() {
        mo1665d0(BuildConfig.FLAVOR, false);
        clearFocus();
        m1431k0(true);
        this.f1098v.setImeOptions(this.f1087k0);
        this.f1086j0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1666f0() {
        int[] iArr = this.f1098v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1101x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1102y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1098v.getImeOptions();
    }

    public int getInputType() {
        return this.f1098v.getInputType();
    }

    public int getMaxWidth() {
        return this.f1082f0;
    }

    public CharSequence getQuery() {
        return this.f1098v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1079c0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1088l0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1069P;
        }
        return getContext().getText(this.f1088l0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1066M;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1065L;
    }

    public C3794a getSuggestionsAdapter() {
        return this.f1077a0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1090n0);
        post(this.f1091o0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1417I(this.f1098v, this.f1059F);
            Rect rect = this.f1060G;
            Rect rect2 = this.f1059F;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0254o oVar = this.f1058E;
            if (oVar == null) {
                C0254o oVar2 = new C0254o(this.f1060G, this.f1059F, this.f1098v);
                this.f1058E = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.mo1739a(this.f1060G, this.f1059F);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo1652L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1082f0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1082f0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1082f0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        m1431k0(savedState.f1104i);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1104i = mo1652L();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1424b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1081e0 || !isFocusable()) {
            return false;
        }
        if (mo1652L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1098v.requestFocus(i, rect);
        if (requestFocus) {
            m1431k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1089m0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1654R();
        } else {
            mo1658V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1075V != z) {
            this.f1075V = z;
            m1431k0(z);
            m1427g0();
        }
    }

    public void setImeOptions(int i) {
        this.f1098v.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1098v.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1082f0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0250k kVar) {
        this.f1071R = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1072S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0251l lVar) {
        this.f1070Q = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1074U = onClickListener;
    }

    public void setOnSuggestionListener(C0252m mVar) {
        this.f1073T = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1079c0 = charSequence;
        m1427g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1080d0 = z;
        C3794a aVar = this.f1077a0;
        if (aVar instanceof C0265a0) {
            ((C0265a0) aVar).mo1920G(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1088l0 = searchableInfo;
        if (searchableInfo != null) {
            m1428h0();
            m1427g0();
        }
        boolean K = m1419K();
        this.f1083g0 = K;
        if (K) {
            this.f1098v.setPrivateImeOptions("nm");
        }
        m1431k0(mo1652L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1078b0 = z;
        m1431k0(mo1652L());
    }

    public void setSuggestionsAdapter(C3794a aVar) {
        this.f1077a0 = aVar;
        this.f1098v.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1059F = new Rect();
        this.f1060G = new Rect();
        this.f1061H = new int[2];
        this.f1062I = new int[2];
        this.f1090n0 = new C0241b();
        this.f1091o0 = new C0242c();
        this.f1092p0 = new WeakHashMap<>();
        C0245f fVar = new C0245f();
        this.f1093q0 = fVar;
        this.f1094r0 = new C0246g();
        C0247h hVar = new C0247h();
        this.f1095s0 = hVar;
        C0248i iVar = new C0248i();
        this.f1096t0 = iVar;
        C0249j jVar = new C0249j();
        this.f1097u0 = jVar;
        this.f1099v0 = new C0240a();
        C0279g0 v = C0279g0.m1627v(context, attributeSet, C3409j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(v.mo1989n(C3409j.SearchView_layout, C3406g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C3405f.search_src_text);
        this.f1098v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1100w = findViewById(C3405f.search_edit_frame);
        View findViewById = findViewById(C3405f.search_plate);
        this.f1101x = findViewById;
        View findViewById2 = findViewById(C3405f.submit_area);
        this.f1102y = findViewById2;
        ImageView imageView = (ImageView) findViewById(C3405f.search_button);
        this.f1103z = imageView;
        ImageView imageView2 = (ImageView) findViewById(C3405f.search_go_btn);
        this.f1054A = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C3405f.search_close_btn);
        this.f1055B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C3405f.search_voice_btn);
        this.f1056C = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C3405f.search_mag_icon);
        this.f1063J = imageView5;
        C3774v.m16223r0(findViewById, v.mo1982g(C3409j.SearchView_queryBackground));
        C3774v.m16223r0(findViewById2, v.mo1982g(C3409j.SearchView_submitBackground));
        int i2 = C3409j.SearchView_searchIcon;
        imageView.setImageDrawable(v.mo1982g(i2));
        imageView2.setImageDrawable(v.mo1982g(C3409j.SearchView_goIcon));
        imageView3.setImageDrawable(v.mo1982g(C3409j.SearchView_closeIcon));
        imageView4.setImageDrawable(v.mo1982g(C3409j.SearchView_voiceIcon));
        imageView5.setImageDrawable(v.mo1982g(i2));
        this.f1064K = v.mo1982g(C3409j.SearchView_searchHintIcon);
        C0285i0.m1700a(imageView, getResources().getString(C3407h.abc_searchview_description_search));
        this.f1065L = v.mo1989n(C3409j.SearchView_suggestionRowLayout, C3406g.abc_search_dropdown_item_icons_2line);
        this.f1066M = v.mo1989n(C3409j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1099v0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1094r0);
        searchAutoComplete.setOnFocusChangeListener(new C0243d());
        setIconifiedByDefault(v.mo1976a(C3409j.SearchView_iconifiedByDefault, true));
        int f = v.mo1981f(C3409j.SearchView_android_maxWidth, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f1069P = v.mo1991p(C3409j.SearchView_defaultQueryHint);
        this.f1079c0 = v.mo1991p(C3409j.SearchView_queryHint);
        int k = v.mo1986k(C3409j.SearchView_android_imeOptions, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo1986k(C3409j.SearchView_android_inputType, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo1976a(C3409j.SearchView_android_focusable, true));
        v.mo1995w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1067N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1068O = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1057D = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0244e());
        }
        m1431k0(this.f1075V);
        m1427g0();
    }
}
