package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0506a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.n */
/* compiled from: TaskStackBuilder */
public final class C0502n implements Iterable<Intent> {

    /* renamed from: g */
    private final ArrayList<Intent> f2685g = new ArrayList<>();

    /* renamed from: h */
    private final Context f2686h;

    /* renamed from: androidx.core.app.n$a */
    /* compiled from: TaskStackBuilder */
    public interface C0503a {
        /* renamed from: q0 */
        Intent mo504q0();
    }

    private C0502n(Context context) {
        this.f2686h = context;
    }

    /* renamed from: t */
    public static C0502n m3133t(Context context) {
        return new C0502n(context);
    }

    /* renamed from: d */
    public C0502n mo3252d(Intent intent) {
        this.f2685g.add(intent);
        return this;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2685g.iterator();
    }

    /* renamed from: p */
    public C0502n mo3254p(Activity activity) {
        Intent q0 = activity instanceof C0503a ? ((C0503a) activity).mo504q0() : null;
        if (q0 == null) {
            q0 = C0480e.m3008a(activity);
        }
        if (q0 != null) {
            ComponentName component = q0.getComponent();
            if (component == null) {
                component = q0.resolveActivity(this.f2686h.getPackageManager());
            }
            mo3255s(component);
            mo3252d(q0);
        }
        return this;
    }

    /* renamed from: s */
    public C0502n mo3255s(ComponentName componentName) {
        int size = this.f2685g.size();
        try {
            Intent b = C0480e.m3009b(this.f2686h, componentName);
            while (b != null) {
                this.f2685g.add(size, b);
                b = C0480e.m3009b(this.f2686h, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: u */
    public void mo3256u() {
        mo3257v((Bundle) null);
    }

    /* renamed from: v */
    public void mo3257v(Bundle bundle) {
        if (!this.f2685g.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2685g;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0506a.m3155g(this.f2686h, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2686h.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
