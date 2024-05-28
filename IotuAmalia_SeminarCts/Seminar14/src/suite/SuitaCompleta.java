package suite;

import dubluriDeTeste.PachetTuristicTest;
import dubluriDeTeste.PersoanaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {
}
