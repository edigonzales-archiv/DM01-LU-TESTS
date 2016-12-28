@GrabResolver(name='catais', root='http://www.catais.org/maven/repository/release/', m2Compatible='true')
@Grab(group='org.interlis2', module='ilivalidator', version='0.5.0')

import groovy.io.FileType

import org.interlis2.validator.Validator;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.settings.Settings;

def settings = new Settings();

settings.setValue(Validator.SETTING_LOGFILE, "fubar.log");
settings.setValue(Validator.SETTING_XTFLOG, "fubar.xtf");
settings.setValue(Validator.SETTING_ILIDIRS, Validator.SETTING_DEFAULT_ILIDIRS);


//def xtfFile = "/home/stefan/tmp/DM01_KT_LU/b_rets.itf"
//def xtfFile = "/home/stefan/Downloads/ch_254900.itf"
def xtfFile = "/home/stefan/Downloads/ch_242500.itf"

try {
	Validator.runValidation(xtfFile, settings);
} catch (Exception e) {
		println "Upsi..."
		e.printStackTrace()	
}
