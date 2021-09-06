@Library('shared-libraries') _
import com.mycorp.somelib.Utilities

def utils = new Utilities(this)

node {
    utils.checkOutFrom('lucene-search-plugin')
    utils.mvn('clean mvn')
}