package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.i0 */
/* compiled from: SavedStateHandle */
public final class C0682i0 {

    /* renamed from: a */
    final Map<String, Object> f3300a;

    /* renamed from: b */
    private final SavedStateRegistry.C1029b f3301b;

    /* renamed from: androidx.lifecycle.i0$a */
    /* compiled from: SavedStateHandle */
    class C0683a implements SavedStateRegistry.C1029b {
        C0683a() {
        }

        /* renamed from: a */
        public Bundle mo4236a() {
            Set<String> keySet = C0682i0.this.f3300a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String next : keySet) {
                arrayList.add(next);
                arrayList2.add(C0682i0.this.f3300a.get(next));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class cls = Double.TYPE;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        Class<Binder> cls4 = Binder.class;
        Class<Bundle> cls5 = Bundle.class;
        Class cls6 = Byte.TYPE;
        Class cls7 = Character.TYPE;
        Class<CharSequence> cls8 = CharSequence.class;
        Class<CharSequence[]> cls9 = CharSequence[].class;
        Class<ArrayList> cls10 = ArrayList.class;
        Class cls11 = Float.TYPE;
        Class<Parcelable> cls12 = Parcelable.class;
        Class<Parcelable[]> cls13 = Parcelable[].class;
        Class<Serializable> cls14 = Serializable.class;
        Class cls15 = Short.TYPE;
        Class<SparseArray> cls16 = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            Class<Size> cls17 = Size.class;
        }
        if (i >= 21) {
            Class<SizeF> cls18 = SizeF.class;
        }
    }

    public C0682i0(Map<String, Object> map) {
        new HashMap();
        this.f3301b = new C0683a();
        this.f3300a = new HashMap(map);
    }

    /* renamed from: a */
    static C0682i0 m4227a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C0682i0();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C0682i0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C0682i0(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SavedStateRegistry.C1029b mo4235b() {
        return this.f3301b;
    }

    public C0682i0() {
        new HashMap();
        this.f3301b = new C0683a();
        this.f3300a = new HashMap();
    }
}
