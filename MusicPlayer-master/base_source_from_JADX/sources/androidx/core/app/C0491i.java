package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0482g;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.core.app.i */
/* compiled from: NotificationCompatJellybean */
class C0491i {

    /* renamed from: a */
    private static final Object f2649a = new Object();

    /* renamed from: b */
    private static Field f2650b;

    /* renamed from: c */
    private static boolean f2651c;

    /* renamed from: a */
    public static SparseArray<Bundle> m3083a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m3084b(C0482g.C0483a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f = aVar.mo3175f();
        bundle2.putInt("icon", f != null ? f.mo3294g() : 0);
        bundle2.putCharSequence("title", aVar.mo3179j());
        bundle2.putParcelable("actionIntent", aVar.mo3170a());
        if (aVar.mo3173d() != null) {
            bundle = new Bundle(aVar.mo3173d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3171b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m3087e(aVar.mo3176g()));
        bundle2.putBoolean("showsUserInterface", aVar.mo3178i());
        bundle2.putInt("semanticAction", aVar.mo3177h());
        return bundle2;
    }

    /* renamed from: c */
    public static Bundle m3085c(Notification notification) {
        synchronized (f2649a) {
            if (f2651c) {
                return null;
            }
            try {
                if (f2650b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2651c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2650b = declaredField;
                }
                Bundle bundle = (Bundle) f2650b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2650b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f2651c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f2651c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m3086d(C0500l lVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", lVar.mo3248i());
        bundle.putCharSequence("label", lVar.mo3247h());
        bundle.putCharSequenceArray("choices", lVar.mo3244e());
        bundle.putBoolean("allowFreeFormInput", lVar.mo3242c());
        bundle.putBundle("extras", lVar.mo3246g());
        Set<String> d = lVar.mo3243d();
        if (d != null && !d.isEmpty()) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: e */
    private static Bundle[] m3087e(C0500l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            bundleArr[i] = m3086d(lVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m3088f(Notification.Builder builder, C0482g.C0483a aVar) {
        IconCompat f = aVar.mo3175f();
        builder.addAction(f != null ? f.mo3294g() : 0, aVar.mo3179j(), aVar.mo3170a());
        Bundle bundle = new Bundle(aVar.mo3173d());
        if (aVar.mo3176g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m3087e(aVar.mo3176g()));
        }
        if (aVar.mo3172c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m3087e(aVar.mo3172c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3171b());
        return bundle;
    }
}
