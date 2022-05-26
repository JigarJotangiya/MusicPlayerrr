package p159f.p166c.p201g.p206n;

import android.media.audiofx.Equalizer;
import p159f.p166c.p201g.C4506a;

/* renamed from: f.c.g.n.c */
/* compiled from: EqualizerEffect */
public class C4559c {

    /* renamed from: a */
    private Equalizer f13243a;

    /* renamed from: b */
    private int f13244b = 0;

    /* renamed from: c */
    private int[] f13245c;

    /* renamed from: a */
    public void mo15269a(int i, int[] iArr) {
        try {
            if (this.f13243a == null) {
                this.f13243a = new Equalizer(C4506a.f13119a, i);
            } else if (this.f13244b != i) {
                mo15270b();
                this.f13243a = new Equalizer(C4506a.f13119a, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f13244b = i;
        this.f13245c = iArr;
    }

    /* renamed from: b */
    public void mo15270b() {
        try {
            Equalizer equalizer = this.f13243a;
            if (equalizer != null) {
                equalizer.setEnabled(false);
                this.f13243a.release();
                this.f13243a = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r5v0 ?, r5v1 ?, r5v6 ?, r5v9 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: c */
    public void mo15271c(int r4, 
/*
Method generation error in method: f.c.g.n.c.c(int, int):void, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* renamed from: d */
    public void mo15272d(boolean z) {
        try {
            if (this.f13243a == null) {
                this.f13243a = new Equalizer(C4506a.f13119a, this.f13244b);
            }
            int[] iArr = z ? this.f13245c : new int[]{0, 0, 0, 0, 0};
            for (int i = 0; i < iArr.length; i++) {
                mo15271c((short) i, (short) iArr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mo15270b();
        }
    }

    /* renamed from: e */
    public void mo15273e(int[] iArr) {
        this.f13245c = iArr;
        try {
            if (this.f13243a != null) {
                for (int i = 0; i < iArr.length; i++) {
                    mo15271c((short) i, (short) iArr[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
