package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0506a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p082e.p083a.C3400a;
import p082e.p083a.C3405f;
import p082e.p122i.p123a.C3799c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.a0 */
/* compiled from: SuggestionsAdapter */
class C0265a0 extends C3799c implements View.OnClickListener {

    /* renamed from: A */
    private int f1236A = -1;

    /* renamed from: B */
    private int f1237B = -1;

    /* renamed from: C */
    private int f1238C = -1;

    /* renamed from: D */
    private int f1239D = -1;

    /* renamed from: E */
    private int f1240E = -1;

    /* renamed from: r */
    private final SearchView f1241r;

    /* renamed from: s */
    private final SearchableInfo f1242s;

    /* renamed from: t */
    private final Context f1243t;

    /* renamed from: u */
    private final WeakHashMap<String, Drawable.ConstantState> f1244u;

    /* renamed from: v */
    private final int f1245v;

    /* renamed from: w */
    private boolean f1246w = false;

    /* renamed from: x */
    private int f1247x = 1;

    /* renamed from: y */
    private ColorStateList f1248y;

    /* renamed from: z */
    private int f1249z = -1;

    /* renamed from: androidx.appcompat.widget.a0$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0266a {

        /* renamed from: a */
        public final TextView f1250a;

        /* renamed from: b */
        public final TextView f1251b;

        /* renamed from: c */
        public final ImageView f1252c;

        /* renamed from: d */
        public final ImageView f1253d;

        /* renamed from: e */
        public final ImageView f1254e;

        public C0266a(View view) {
            this.f1250a = (TextView) view.findViewById(16908308);
            this.f1251b = (TextView) view.findViewById(16908309);
            this.f1252c = (ImageView) view.findViewById(16908295);
            this.f1253d = (ImageView) view.findViewById(16908296);
            this.f1254e = (ImageView) view.findViewById(C3405f.edit_query);
        }
    }

    public C0265a0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1241r = searchView;
        this.f1242s = searchableInfo;
        this.f1245v = searchView.getSuggestionCommitIconResId();
        this.f1243t = context;
        this.f1244u = weakHashMap;
    }

    /* renamed from: B */
    private Drawable m1547B(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1243t.getPackageName() + "/" + parseInt;
            Drawable t = m1555t(str2);
            if (t != null) {
                return t;
            }
            Drawable d = C0506a.m3152d(this.f1243t, parseInt);
            m1553J(str2, d);
            return d;
        } catch (NumberFormatException unused) {
            Drawable t2 = m1555t(str);
            if (t2 != null) {
                return t2;
            }
            Drawable z = m1561z(Uri.parse(str));
            m1553J(str, z);
            return z;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: C */
    private Drawable m1548C(Cursor cursor) {
        int i = this.f1238C;
        if (i == -1) {
            return null;
        }
        Drawable B = m1547B(cursor.getString(i));
        if (B != null) {
            return B;
        }
        return m1560y();
    }

    /* renamed from: D */
    private Drawable m1549D(Cursor cursor) {
        int i = this.f1239D;
        if (i == -1) {
            return null;
        }
        return m1547B(cursor.getString(i));
    }

    /* renamed from: F */
    private static String m1550F(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: H */
    private void m1551H(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: I */
    private void m1552I(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: J */
    private void m1553J(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1244u.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: K */
    private void m1554K(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: t */
    private Drawable m1555t(String str) {
        Drawable.ConstantState constantState = this.f1244u.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: u */
    private CharSequence m1556u(CharSequence charSequence) {
        if (this.f1248y == null) {
            TypedValue typedValue = new TypedValue();
            this.f11868j.getTheme().resolveAttribute(C3400a.textColorSearchUrl, typedValue, true);
            this.f1248y = this.f11868j.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1248y, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: v */
    private Drawable m1557v(ComponentName componentName) {
        PackageManager packageManager = this.f11868j.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: w */
    private Drawable m1558w(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1244u.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1244u.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1243t.getResources());
        }
        Drawable v = m1557v(componentName);
        if (v != null) {
            constantState = v.getConstantState();
        }
        this.f1244u.put(flattenToShortString, constantState);
        return v;
    }

    /* renamed from: x */
    public static String m1559x(Cursor cursor, String str) {
        return m1550F(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: y */
    private Drawable m1560y() {
        Drawable w = m1558w(this.f1242s.getSearchActivity());
        if (w != null) {
            return w;
        }
        return this.f11868j.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1561z(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo1918A(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1243t     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0265a0.m1561z(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Drawable mo1918A(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f11868j.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public Cursor mo1919E(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f11868j.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: G */
    public void mo1920G(int i) {
        this.f1247x = i;
    }

    /* renamed from: a */
    public void mo1921a(Cursor cursor) {
        if (this.f1246w) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1921a(cursor);
            if (cursor != null) {
                this.f1249z = cursor.getColumnIndex("suggest_text_1");
                this.f1236A = cursor.getColumnIndex("suggest_text_2");
                this.f1237B = cursor.getColumnIndex("suggest_text_2_url");
                this.f1238C = cursor.getColumnIndex("suggest_icon_1");
                this.f1239D = cursor.getColumnIndex("suggest_icon_2");
                this.f1240E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: d */
    public CharSequence mo1922d(Cursor cursor) {
        String x;
        String x2;
        if (cursor == null) {
            return null;
        }
        String x3 = m1559x(cursor, "suggest_intent_query");
        if (x3 != null) {
            return x3;
        }
        if (this.f1242s.shouldRewriteQueryFromData() && (x2 = m1559x(cursor, "suggest_intent_data")) != null) {
            return x2;
        }
        if (!this.f1242s.shouldRewriteQueryFromText() || (x = m1559x(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return x;
    }

    /* renamed from: f */
    public Cursor mo1923f(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f1241r.getVisibility() == 0 && this.f1241r.getWindowVisibility() == 0) {
            try {
                Cursor E = mo1919E(this.f1242s, charSequence2, 50);
                if (E != null) {
                    E.getCount();
                    return E;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View p = mo13246p(this.f11868j, this.f11867i, viewGroup);
            if (p != null) {
                ((C0266a) p.getTag()).f1250a.setText(e.toString());
            }
            return p;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View q = mo1931q(this.f11868j, this.f11867i, viewGroup);
            if (q != null) {
                ((C0266a) q.getTag()).f1250a.setText(e.toString());
            }
            return q;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: n */
    public void mo1927n(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0266a aVar = (C0266a) view.getTag();
        int i = this.f1240E;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1250a != null) {
            m1552I(aVar.f1250a, m1550F(cursor, this.f1249z));
        }
        if (aVar.f1251b != null) {
            String F = m1550F(cursor, this.f1237B);
            if (F != null) {
                charSequence = m1556u(F);
            } else {
                charSequence = m1550F(cursor, this.f1236A);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1250a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1250a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1250a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1250a.setMaxLines(1);
                }
            }
            m1552I(aVar.f1251b, charSequence);
        }
        ImageView imageView = aVar.f1252c;
        if (imageView != null) {
            m1551H(imageView, m1548C(cursor), 4);
        }
        ImageView imageView2 = aVar.f1253d;
        if (imageView2 != null) {
            m1551H(imageView2, m1549D(cursor), 8);
        }
        int i3 = this.f1247x;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1254e.setVisibility(0);
            aVar.f1254e.setTag(aVar.f1250a.getText());
            aVar.f1254e.setOnClickListener(this);
            return;
        }
        aVar.f1254e.setVisibility(8);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1554K(mo13240b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1554K(mo13240b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1241r.mo1657U((CharSequence) tag);
        }
    }

    /* renamed from: q */
    public View mo1931q(Context context, Cursor cursor, ViewGroup viewGroup) {
        View q = super.mo1931q(context, cursor, viewGroup);
        q.setTag(new C0266a(q));
        ((ImageView) q.findViewById(C3405f.edit_query)).setImageResource(this.f1245v);
        return q;
    }
}
