@Library('shared-libraries') _
import com.mycorp.somelib.Helper

pipe = new Helper('Gustavo Scheffer', 34)

pipe.createBuild(currentBuild.getNumber())
