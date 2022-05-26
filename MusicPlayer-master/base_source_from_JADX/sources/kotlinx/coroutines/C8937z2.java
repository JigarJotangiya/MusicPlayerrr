package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: kotlinx.coroutines.z2 */
/* compiled from: Timeout.kt */
public final class C8937z2 extends CancellationException implements C8865k0<C8937z2> {
    public final C8665a2 coroutine;

    public C8937z2(String str, C8665a2 a2Var) {
        super(str);
        this.coroutine = a2Var;
    }

    public C8937z2 createCopy() {
        String message = getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        C8937z2 z2Var = new C8937z2(message, this.coroutine);
        z2Var.initCause(this);
        return z2Var;
    }

    public C8937z2(String str) {
        this(str, (C8665a2) null);
    }
}
