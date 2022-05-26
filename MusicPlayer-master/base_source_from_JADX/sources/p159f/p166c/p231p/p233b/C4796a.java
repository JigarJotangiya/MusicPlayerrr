package p159f.p166c.p231p.p233b;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.coocent.videostore.p067po.Video;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8906s0;
import kotlinx.coroutines.C8910t0;
import p159f.p166c.p231p.p235d.p236c.C4821b;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.b.a */
/* compiled from: FileUtils.kt */
public final class C4796a {

    /* renamed from: a */
    private static BufferedInputStream f13589a;

    /* renamed from: b */
    private static BufferedOutputStream f13590b;

    @C8533f(mo30599c = "com.coocent.videostore.utils.FileUtilsKt$renameVideo$1", mo30600f = "FileUtils.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.b.a$a */
    /* compiled from: FileUtils.kt */
    static final class C4797a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ C4801e $listener;
        final /* synthetic */ String $title;
        final /* synthetic */ Video $video;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4797a(String str, Video video, Context context, C4801e eVar, C8508d<? super C4797a> dVar) {
            super(2, dVar);
            this.$title = str;
            this.$video = video;
            this.$context = context;
            this.$listener = eVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4797a(this.$title, this.$video, this.$context, this.$listener, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4797a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                try {
                    String str = this.$title + '.' + this.$video.mo10548h();
                    File file = new File(this.$video.mo10551j(), str);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    int i = Build.VERSION.SDK_INT;
                    if (i < 30) {
                        contentValues.put("_data", file.getPath());
                    }
                    Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.$video.mo10553l());
                    C8594l.m46770d(withAppendedId, "withAppendedId(MediaStor…AL_CONTENT_URI, video.id)");
                    if (this.$context.getContentResolver().update(withAppendedId, contentValues, "_id = ?", new String[]{String.valueOf(this.$video.mo10553l())}) <= 0) {
                        this.$listener.mo10177a(new C4821b((String) null, 1, (C8589g) null));
                    } else if (i >= 30) {
                        C4801e eVar = this.$listener;
                        long l = this.$video.mo10553l();
                        String str2 = this.$title;
                        String path = file.getPath();
                        C8594l.m46770d(path, "renameFile.path");
                        eVar.mo10178b(l, str2, str, path);
                    } else if (i >= 29 && !Environment.isExternalStorageLegacy()) {
                        C4801e eVar2 = this.$listener;
                        long l2 = this.$video.mo10553l();
                        String str3 = this.$title;
                        String path2 = file.getPath();
                        C8594l.m46770d(path2, "renameFile.path");
                        eVar2.mo10178b(l2, str3, str, path2);
                    } else if (new File(this.$video.mo10551j(), this.$video.mo10546f()).renameTo(file)) {
                        C4801e eVar3 = this.$listener;
                        long l3 = this.$video.mo10553l();
                        String str4 = this.$title;
                        String path3 = file.getPath();
                        C8594l.m46770d(path3, "renameFile.path");
                        eVar3.mo10178b(l3, str4, str, path3);
                    } else {
                        this.$listener.mo10177a(new C4821b((String) null, 1, (C8589g) null));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.$listener.mo10177a(e);
                }
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m20376a() {
        BufferedInputStream bufferedInputStream = f13589a;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        BufferedOutputStream bufferedOutputStream = f13590b;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.close();
        }
    }

    /* renamed from: b */
    private static final long m20377b(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, long j, C4800d dVar) throws IOException {
        byte[] bArr = new byte[(j > 1024000 ? 2048 : 1024)];
        double available = (double) bufferedInputStream.available();
        long j2 = 0;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read > 0) {
                bufferedOutputStream.write(bArr, 0, read);
                j2 += (long) read;
                bufferedOutputStream.flush();
                if (dVar != null) {
                    dVar.mo10074a((((double) 1) - (((double) bufferedInputStream.available()) / available)) * ((double) 100));
                }
            } else {
                bufferedInputStream.close();
                bufferedOutputStream.close();
                return j2;
            }
        }
    }

    /* renamed from: c */
    public static final long m20378c(InputStream inputStream, OutputStream outputStream, C4800d dVar, long j) throws IOException {
        BufferedInputStream bufferedInputStream;
        C8594l.m46771e(inputStream, "inputStream");
        C8594l.m46771e(outputStream, "outputStream");
        f13589a = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        f13590b = bufferedOutputStream;
        if (bufferedOutputStream == null || (bufferedInputStream = f13589a) == null) {
            return -1;
        }
        return m20377b(bufferedInputStream, bufferedOutputStream, j, dVar);
    }

    /* renamed from: d */
    public static final long m20379d(InputStream inputStream, Path path, long j, C4800d dVar, CopyOption... copyOptionArr) throws IOException {
        C8594l.m46771e(inputStream, "inputStream");
        C8594l.m46771e(copyOptionArr, "options");
        Objects.requireNonNull(inputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            StandardCopyOption standardCopyOption = copyOptionArr[i];
            i++;
            if (standardCopyOption == StandardCopyOption.REPLACE_EXISTING) {
                z = true;
            } else {
                Objects.requireNonNull(standardCopyOption, "options contains 'null'");
                throw new UnsupportedOperationException(standardCopyOption + " not supported");
            }
        }
        SecurityException e = null;
        if (z) {
            try {
                Files.deleteIfExists(path);
            } catch (SecurityException e2) {
                e = e2;
            }
        }
        try {
            OutputStream newOutputStream = Files.newOutputStream(path, new OpenOption[]{StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE});
            C8594l.m46770d(newOutputStream, "newOutputStream(target, …StandardOpenOption.WRITE)");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(newOutputStream);
            f13589a = bufferedInputStream;
            f13590b = bufferedOutputStream;
            if (bufferedOutputStream == null || bufferedInputStream == null) {
                return -1;
            }
            return m20377b(bufferedInputStream, bufferedOutputStream, j, dVar);
        } catch (FileAlreadyExistsException e3) {
            if (e != null) {
                throw e;
            }
            throw e3;
        }
    }

    /* renamed from: e */
    public static final String m20380e(Context context) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        sb.append(filesDir == null ? null : filesDir.getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("video");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m20381f(Context context, Uri uri) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(uri, "uri");
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                return false;
            }
            openAssetFileDescriptor.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public static final void m20382g(Context context, Video video, String str, C4801e eVar) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(video, "video");
        C8594l.m46771e(str, "title");
        C8594l.m46771e(eVar, "listener");
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new C4797a(str, video, context, eVar, (C8508d<? super C4797a>) null), 2, (Object) null);
    }
}
