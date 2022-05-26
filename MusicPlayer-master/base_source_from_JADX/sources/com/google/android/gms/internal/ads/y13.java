package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class y13 implements Iterable<String> {

    /* renamed from: g */
    final /* synthetic */ CharSequence f26203g;

    /* renamed from: h */
    final /* synthetic */ b23 f26204h;

    y13(b23 b23, CharSequence charSequence) {
        this.f26204h = b23;
        this.f26203g = charSequence;
    }

    public final Iterator<String> iterator() {
        return this.f26204h.m21044g(this.f26203g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(j13.m25478a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(j13.m25478a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
