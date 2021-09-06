@Library('shared-libraries') _
import com.mycorp.somelib.Helper

int useSomeLib(Helper helper) {
    return helper.showMessage()
}

echo useSomeLib(new Helper('This is my Pipe!'))