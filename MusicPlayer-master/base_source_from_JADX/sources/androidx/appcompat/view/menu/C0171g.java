package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0506a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p082e.p109h.p111i.p112a.C3638a;
import p082e.p109h.p119p.C3707b;
import p082e.p109h.p119p.C3787w;

/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuBuilder */
public class C0171g implements C3638a {

    /* renamed from: A */
    private static final int[] f676A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f677a;

    /* renamed from: b */
    private final Resources f678b;

    /* renamed from: c */
    private boolean f679c;

    /* renamed from: d */
    private boolean f680d;

    /* renamed from: e */
    private C0172a f681e;

    /* renamed from: f */
    private ArrayList<C0175i> f682f;

    /* renamed from: g */
    private ArrayList<C0175i> f683g;

    /* renamed from: h */
    private boolean f684h;

    /* renamed from: i */
    private ArrayList<C0175i> f685i;

    /* renamed from: j */
    private ArrayList<C0175i> f686j;

    /* renamed from: k */
    private boolean f687k;

    /* renamed from: l */
    private int f688l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f689m;

    /* renamed from: n */
    CharSequence f690n;

    /* renamed from: o */
    Drawable f691o;

    /* renamed from: p */
    View f692p;

    /* renamed from: q */
    private boolean f693q = false;

    /* renamed from: r */
    private boolean f694r = false;

    /* renamed from: s */
    private boolean f695s = false;

    /* renamed from: t */
    private boolean f696t = false;

    /* renamed from: u */
    private boolean f697u = false;

    /* renamed from: v */
    private ArrayList<C0175i> f698v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0186m>> f699w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0175i f700x;

    /* renamed from: y */
    private boolean f701y = false;

    /* renamed from: z */
    private boolean f702z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuBuilder */
    public interface C0172a {
        /* renamed from: a */
        boolean mo532a(C0171g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo534b(C0171g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* compiled from: MenuBuilder */
    public interface C0173b {
        /* renamed from: a */
        boolean mo740a(C0175i iVar);
    }

    public C0171g(Context context) {
        this.f677a = context;
        this.f678b = context.getResources();
        this.f682f = new ArrayList<>();
        this.f683g = new ArrayList<>();
        this.f684h = true;
        this.f685i = new ArrayList<>();
        this.f686j = new ArrayList<>();
        this.f687k = true;
        m993f0(true);
    }

    /* renamed from: D */
    private static int m990D(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f676A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m991P(int i, boolean z) {
        if (i >= 0 && i < this.f682f.size()) {
            this.f682f.remove(i);
            if (z) {
                mo893M(true);
            }
        }
    }

    /* renamed from: a0 */
    private void m992a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = mo885E();
        if (view != null) {
            this.f692p = view;
            this.f690n = null;
            this.f691o = null;
        } else {
            if (i > 0) {
                this.f690n = E.getText(i);
            } else if (charSequence != null) {
                this.f690n = charSequence;
            }
            if (i2 > 0) {
                this.f691o = C0506a.m3152d(mo954w(), i2);
            } else if (drawable != null) {
                this.f691o = drawable;
            }
            this.f692p = null;
        }
        mo893M(false);
    }

    /* renamed from: f0 */
    private void m993f0(boolean z) {
        boolean z2 = true;
        if (!z || this.f678b.getConfiguration().keyboard == 1 || !C3787w.m16292e(ViewConfiguration.get(this.f677a), this.f677a)) {
            z2 = false;
        }
        this.f680d = z2;
    }

    /* renamed from: g */
    private C0175i m994g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0175i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m995i(boolean z) {
        if (!this.f699w.isEmpty()) {
            mo932h0();
            Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0186m mVar = (C0186m) next.get();
                if (mVar == null) {
                    this.f699w.remove(next);
                } else {
                    mVar.mo815E(z);
                }
            }
            mo929g0();
        }
    }

    /* renamed from: j */
    private void m996j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f699w.isEmpty()) {
            Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0186m mVar = (C0186m) next.get();
                if (mVar == null) {
                    this.f699w.remove(next);
                } else {
                    int D = mVar.mo814D();
                    if (D > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(D)) != null) {
                        mVar.mo837K(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m997k(Bundle bundle) {
        Parcelable M;
        if (!this.f699w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0186m mVar = (C0186m) next.get();
                if (mVar == null) {
                    this.f699w.remove(next);
                } else {
                    int D = mVar.mo814D();
                    if (D > 0 && (M = mVar.mo838M()) != null) {
                        sparseArray.put(D, M);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: l */
    private boolean m998l(C0195r rVar, C0186m mVar) {
        boolean z = false;
        if (this.f699w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo820L(rVar);
        }
        Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0186m mVar2 = (C0186m) next.get();
            if (mVar2 == null) {
                this.f699w.remove(next);
            } else if (!z) {
                z = mVar2.mo820L(rVar);
            }
        }
        return z;
    }

    /* renamed from: p */
    private static int m999p(ArrayList<C0175i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo966f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View mo882A() {
        return this.f692p;
    }

    /* renamed from: B */
    public ArrayList<C0175i> mo883B() {
        mo951t();
        return this.f686j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo884C() {
        return this.f696t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public Resources mo885E() {
        return this.f678b;
    }

    /* renamed from: F */
    public C0171g mo886F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0175i> mo887G() {
        if (!this.f684h) {
            return this.f683g;
        }
        this.f683g.clear();
        int size = this.f682f.size();
        for (int i = 0; i < size; i++) {
            C0175i iVar = this.f682f.get(i);
            if (iVar.isVisible()) {
                this.f683g.add(iVar);
            }
        }
        this.f684h = false;
        this.f687k = true;
        return this.f683g;
    }

    /* renamed from: H */
    public boolean mo888H() {
        return this.f701y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo889I() {
        return this.f679c;
    }

    /* renamed from: J */
    public boolean mo890J() {
        return this.f680d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo891K(C0175i iVar) {
        this.f687k = true;
        mo893M(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo892L(C0175i iVar) {
        this.f684h = true;
        mo893M(true);
    }

    /* renamed from: M */
    public void mo893M(boolean z) {
        if (!this.f693q) {
            if (z) {
                this.f684h = true;
                this.f687k = true;
            }
            m995i(z);
            return;
        }
        this.f694r = true;
        if (z) {
            this.f695s = true;
        }
    }

    /* renamed from: N */
    public boolean mo894N(MenuItem menuItem, int i) {
        return mo895O(menuItem, (C0186m) null, i);
    }

    /* renamed from: O */
    public boolean mo895O(MenuItem menuItem, C0186m mVar, int i) {
        C0175i iVar = (C0175i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k = iVar.mo988k();
        C3707b b = iVar.mo756b();
        boolean z = b != null && b.mo1077a();
        if (iVar.mo987j()) {
            k |= iVar.expandActionView();
            if (k) {
                mo925e(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo925e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.mo1018x(new C0195r(mo954w(), this, iVar));
            }
            C0195r rVar = (C0195r) iVar.getSubMenu();
            if (z) {
                b.mo1080f(rVar);
            }
            k |= m998l(rVar, mVar);
            if (!k) {
                mo925e(true);
            }
        } else if ((i & 1) == 0) {
            mo925e(true);
        }
        return k;
    }

    /* renamed from: Q */
    public void mo896Q(C0186m mVar) {
        Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0186m mVar2 = (C0186m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f699w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void mo897R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo953v());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0195r) item.getSubMenu()).mo897R(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: S */
    public void mo898S(Bundle bundle) {
        m996j(bundle);
    }

    /* renamed from: T */
    public void mo899T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0195r) item.getSubMenu()).mo899T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo953v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void mo900U(Bundle bundle) {
        m997k(bundle);
    }

    /* renamed from: V */
    public void mo901V(C0172a aVar) {
        this.f681e = aVar;
    }

    /* renamed from: W */
    public C0171g mo902W(int i) {
        this.f688l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo903X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f682f.size();
        mo932h0();
        for (int i = 0; i < size; i++) {
            C0175i iVar = this.f682f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo990m() && iVar.isCheckable()) {
                iVar.mo996s(iVar == menuItem);
            }
        }
        mo929g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0171g mo904Y(int i) {
        m992a0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0171g mo905Z(Drawable drawable) {
        m992a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo906a(int i, int i2, int i3, CharSequence charSequence) {
        int D = m990D(i3);
        C0175i g = m994g(i, i2, i3, D, charSequence, this.f688l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f689m;
        if (contextMenuInfo != null) {
            g.mo1016v(contextMenuInfo);
        }
        ArrayList<C0175i> arrayList = this.f682f;
        arrayList.add(m999p(arrayList, D), g);
        mo893M(true);
        return g;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo906a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f677a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo916b(C0186m mVar) {
        mo918c(mVar, this.f677a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0171g mo917b0(int i) {
        m992a0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo918c(C0186m mVar, Context context) {
        this.f699w.add(new WeakReference(mVar));
        mVar.mo819J(context, this);
        this.f687k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0171g mo919c0(CharSequence charSequence) {
        m992a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        C0175i iVar = this.f700x;
        if (iVar != null) {
            mo927f(iVar);
        }
        this.f682f.clear();
        mo893M(true);
    }

    public void clearHeader() {
        this.f691o = null;
        this.f690n = null;
        this.f692p = null;
        mo893M(false);
    }

    public void close() {
        mo925e(true);
    }

    /* renamed from: d */
    public void mo923d() {
        C0172a aVar = this.f681e;
        if (aVar != null) {
            aVar.mo534b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0171g mo924d0(View view) {
        m992a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: e */
    public final void mo925e(boolean z) {
        if (!this.f697u) {
            this.f697u = true;
            Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0186m mVar = (C0186m) next.get();
                if (mVar == null) {
                    this.f699w.remove(next);
                } else {
                    mVar.mo822c(this, z);
                }
            }
            this.f697u = false;
        }
    }

    /* renamed from: e0 */
    public void mo926e0(boolean z) {
        this.f702z = z;
    }

    /* renamed from: f */
    public boolean mo927f(C0175i iVar) {
        boolean z = false;
        if (!this.f699w.isEmpty() && this.f700x == iVar) {
            mo932h0();
            Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0186m mVar = (C0186m) next.get();
                if (mVar == null) {
                    this.f699w.remove(next);
                } else {
                    z = mVar.mo816G(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo929g0();
            if (z) {
                this.f700x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0175i iVar = this.f682f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void mo929g0() {
        this.f693q = false;
        if (this.f694r) {
            this.f694r = false;
            mo893M(this.f695s);
        }
    }

    public MenuItem getItem(int i) {
        return this.f682f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo931h(C0171g gVar, MenuItem menuItem) {
        C0172a aVar = this.f681e;
        return aVar != null && aVar.mo532a(gVar, menuItem);
    }

    /* renamed from: h0 */
    public void mo932h0() {
        if (!this.f693q) {
            this.f693q = true;
            this.f694r = false;
            this.f695s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f702z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f682f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo941r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo935m(C0175i iVar) {
        boolean z = false;
        if (this.f699w.isEmpty()) {
            return false;
        }
        mo932h0();
        Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0186m mVar = (C0186m) next.get();
            if (mVar == null) {
                this.f699w.remove(next);
            } else {
                z = mVar.mo817H(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo929g0();
        if (z) {
            this.f700x = iVar;
        }
        return z;
    }

    /* renamed from: n */
    public int mo936n(int i) {
        return mo937o(i, 0);
    }

    /* renamed from: o */
    public int mo937o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f682f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo894N(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0175i r = mo941r(i, keyEvent);
        boolean N = r != null ? mo894N(r, i2) : false;
        if ((i2 & 2) != 0) {
            mo925e(true);
        }
        return N;
    }

    /* renamed from: q */
    public int mo940q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f682f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0175i mo941r(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0175i> arrayList = this.f698v;
        arrayList.clear();
        mo944s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = mo889I();
        for (int i2 = 0; i2 < size; i2++) {
            C0175i iVar = arrayList.get(i2);
            if (I) {
                c = iVar.getAlphabeticShortcut();
            } else {
                c = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (I && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int n = mo936n(i);
        if (n >= 0) {
            int size = this.f682f.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f682f.get(n).getGroupId() != i) {
                    mo893M(true);
                } else {
                    m991P(n, false);
                    i2 = i3;
                }
            }
            mo893M(true);
        }
    }

    public void removeItem(int i) {
        m991P(mo940q(i), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo944s(List<C0175i> list, int i, KeyEvent keyEvent) {
        boolean I = mo889I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f682f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0175i iVar = this.f682f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0171g) iVar.getSubMenu()).mo944s(list, i, keyEvent);
                }
                char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f682f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0175i iVar = this.f682f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo1013t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f701y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f682f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0175i iVar = this.f682f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f682f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0175i iVar = this.f682f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo1019y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo893M(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f679c = z;
        mo893M(false);
    }

    public int size() {
        return this.f682f.size();
    }

    /* renamed from: t */
    public void mo951t() {
        ArrayList<C0175i> G = mo887G();
        if (this.f687k) {
            Iterator<WeakReference<C0186m>> it = this.f699w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0186m mVar = (C0186m) next.get();
                if (mVar == null) {
                    this.f699w.remove(next);
                } else {
                    z |= mVar.mo836F();
                }
            }
            if (z) {
                this.f685i.clear();
                this.f686j.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    C0175i iVar = G.get(i);
                    if (iVar.mo989l()) {
                        this.f685i.add(iVar);
                    } else {
                        this.f686j.add(iVar);
                    }
                }
            } else {
                this.f685i.clear();
                this.f686j.clear();
                this.f686j.addAll(mo887G());
            }
            this.f687k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0175i> mo952u() {
        mo951t();
        return this.f685i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo953v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context mo954w() {
        return this.f677a;
    }

    /* renamed from: x */
    public C0175i mo955x() {
        return this.f700x;
    }

    /* renamed from: y */
    public Drawable mo956y() {
        return this.f691o;
    }

    /* renamed from: z */
    public CharSequence mo957z() {
        return this.f690n;
    }

    public MenuItem add(int i) {
        return mo906a(0, 0, 0, this.f678b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f678b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo906a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0175i iVar = (C0175i) mo906a(i, i2, i3, charSequence);
        C0195r rVar = new C0195r(this.f677a, this, iVar);
        iVar.mo1018x(rVar);
        return rVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo906a(i, i2, i3, this.f678b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f678b.getString(i4));
    }
}
