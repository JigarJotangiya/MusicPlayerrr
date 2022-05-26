package net.coocent.android.xmlparser.initializer;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.startup.C1038b;
import com.google.android.gms.ads.C3097n;
import com.google.android.gms.ads.C3110r;
import com.google.android.gms.ads.p075y.C3128b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9566f;

public class MobileAdsInitializer implements C1038b<Boolean> {
    /* renamed from: d */
    private void m49778d(Context context) {
        C3097n.m13617b(context, new C9452a(context));
    }

    /* renamed from: e */
    static /* synthetic */ void m49779e(Context context, C3128b bVar) {
        if (context.getApplicationContext() != null && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (application instanceof AbstractApplication) {
                C3097n.m13618c(((AbstractApplication) application).mo26943e());
            }
            String k = C9566f.m50200k();
            if (!TextUtils.isEmpty(k)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(k);
                C3110r.C3111a aVar = new C3110r.C3111a();
                aVar.mo11345b(arrayList);
                C3097n.m13619d(aVar.mo11344a());
            }
        }
    }

    /* renamed from: a */
    public List<Class<? extends C1038b<?>>> mo5766a() {
        return Collections.singletonList(PromotionNativeInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo5767b(Context context) {
        if (!C9566f.m50208s(context)) {
            m49778d(context);
        } else if (!C9502v.m49955z(context)) {
            m49778d(context);
        }
        return Boolean.TRUE;
    }
}
