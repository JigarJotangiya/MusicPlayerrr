package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p159f.p243f.p245b.p318c.p319a.p320a.C7618w;

/* renamed from: com.google.android.play.core.assetpacks.j0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6370j0 extends C7618w {

    /* renamed from: g */
    private final File f29512g;

    /* renamed from: h */
    private final File f29513h;

    /* renamed from: i */
    private final NavigableMap<Long, File> f29514i = new TreeMap();

    C6370j0(File file, File file2) throws IOException {
        this.f29512g = file;
        this.f29513h = file2;
        List<File> a = C6373j3.m37697a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File next : a) {
                this.f29514i.put(Long.valueOf(j), next);
                j += next.length();
            }
            return;
        }
        throw new C6361h1(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: x */
    private final InputStream m37694x(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f29514i.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C6361h1(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    /* renamed from: c */
    public final long mo25294c() {
        Map.Entry<Long, File> lastEntry = this.f29514i.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    public final void close() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final InputStream mo25296d(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C6361h1(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo25294c()) {
            Long floorKey = this.f29514i.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f29514i.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C6365i0(m37694x(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m37694x(j, floorKey));
            Collection values = this.f29514i.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C6382l2(Collections.enumeration(values)));
            }
            arrayList.add(new C6365i0(new FileInputStream((File) this.f29514i.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C6361h1(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo25294c()), Long.valueOf(j3)}));
    }
}
