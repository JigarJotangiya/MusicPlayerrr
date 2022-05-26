package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.app.i */
/* compiled from: SkinAppCompatDelegateImpl */
public class C0142i extends AppCompatDelegateImpl {

    /* renamed from: m0 */
    private static Map<Activity, WeakReference<C0136e>> f492m0 = new WeakHashMap();

    private C0142i(Context context, Window window, C0135d dVar) {
        super(context, window, dVar);
    }

    /* renamed from: R0 */
    public static C0136e m793R0(Activity activity, C0135d dVar) {
        C0136e eVar;
        WeakReference weakReference = f492m0.get(activity);
        if (weakReference == null) {
            eVar = null;
        } else {
            eVar = (C0136e) weakReference.get();
        }
        if (eVar != null) {
            return eVar;
        }
        C0142i iVar = new C0142i(activity, activity.getWindow(), dVar);
        f492m0.put(activity, new WeakReference(iVar));
        return iVar;
    }

    /* renamed from: o */
    public void mo547o() {
    }
}
