package p159f.p243f.p245b.p246a.p248b;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;
import java.lang.reflect.Field;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: f.f.b.a.b.b */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C4865b<T> extends C4863a.C4864a {

    /* renamed from: g */
    private final T f13686g;

    private C4865b(T t) {
        this.f13686g = t;
    }

    @RecentlyNonNull
    /* renamed from: K0 */
    public static <T> T m20502K0(@RecentlyNonNull C4863a aVar) {
        if (aVar instanceof C4865b) {
            return ((C4865b) aVar).f13686g;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C3292l.m14240h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @RecentlyNonNull
    /* renamed from: f2 */
    public static <T> C4863a m20503f2(@RecentlyNonNull T t) {
        return new C4865b(t);
    }
}
