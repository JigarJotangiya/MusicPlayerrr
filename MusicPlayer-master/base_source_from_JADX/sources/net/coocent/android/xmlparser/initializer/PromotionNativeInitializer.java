package net.coocent.android.xmlparser.initializer;

import android.content.Context;
import androidx.startup.C1038b;
import java.util.Collections;
import java.util.List;
import net.coocent.android.xmlparser.p461z.C9564d;
import p159f.p237d.p238a.C4824b;
import p159f.p237d.p238a.C4825c;

public class PromotionNativeInitializer implements C1038b<Boolean> {
    /* renamed from: a */
    public List<Class<? extends C1038b<?>>> mo5766a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public Boolean mo5767b(Context context) {
        try {
            C4825c.m20449a(context, "promotion");
        } catch (C4824b e) {
            e.printStackTrace();
            C9564d.m50188n(context);
        }
        return Boolean.TRUE;
    }
}
