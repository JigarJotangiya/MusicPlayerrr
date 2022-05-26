package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3385e implements DynamiteModule.C3380b {
    C3385e() {
    }

    /* renamed from: a */
    public final C3389i mo11999a(Context context, String str, C3388h hVar) throws DynamiteModule.C3379a {
        C3389i iVar = new C3389i();
        iVar.f10805a = hVar.mo12003b(context, str);
        int a = hVar.mo12002a(context, str, true);
        iVar.f10806b = a;
        int i = iVar.f10805a;
        if (i == 0) {
            if (a == 0) {
                iVar.f10807c = 0;
                return iVar;
            }
            i = 0;
        }
        if (a >= i) {
            iVar.f10807c = 1;
        } else {
            iVar.f10807c = -1;
        }
        return iVar;
    }
}
