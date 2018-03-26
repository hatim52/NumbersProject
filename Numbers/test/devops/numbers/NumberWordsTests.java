package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	public NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void numberZero() {
		Assert.assertEquals( "Error", "Exit", numberWords.toWords( 0 ) ) ;
	}
	@Test
	public void numberOne() {
		Assert.assertEquals( "Success", "ONE", numberWords.toWords( 1 ) ) ;
	}
	@Test
	public void numberTen() {
		Assert.assertEquals( "Success", "TEN", numberWords.toWords( 10 ) ) ;
	}
	@Test
	public void numberEleven() {
		Assert.assertEquals( "Success", "ELEVEN", numberWords.toWords( 11 ) ) ;
	}
	@Test
	public void numberNineteen() {
		Assert.assertEquals( "Success", "NINETEEN", numberWords.toWords( 19 ) ) ;
	}
	@Test
	public void numberTwenty() {
		Assert.assertEquals( "Success", "TWENTY", numberWords.toWords( 20 ) ) ;
	}
	@Test
	public void numberTwentyNine() {
		Assert.assertEquals( "Success", "TWENTY NINE", numberWords.toWords( 29 ) ) ;
	}
	@Test
	public void numberFiftyFive() {
		Assert.assertEquals( "Success", "FIFTY FIVE", numberWords.toWords( 55 ) ) ;
	}
	@Test
	public void numberNinety() {
		Assert.assertEquals( "Success", "NINETY", numberWords.toWords( 90 ) ) ;
	}
	@Test
	public void numberNinetyNine() {
		Assert.assertEquals( "Success", "NINETY NINE", numberWords.toWords( 99 ) ) ;
	}
	@Test
	public void numberHundred() {
		Assert.assertEquals( "Success", "ONE HUNDRED", numberWords.toWords( 100 ) ) ;
	}
	@Test
	public void number101() {
		Assert.assertEquals( "Success", "ONE HUNDRED ONE", numberWords.toWords( 101 ) ) ;
	}
	@Test
	public void number110() {
		Assert.assertEquals( "Success", "ONE HUNDRED TEN", numberWords.toWords( 110 ) ) ;
	}
	@Test
	public void number200() {
		Assert.assertEquals( "Success", "TWO HUNDRED", numberWords.toWords( 200 ) ) ;
	}
	@Test
	public void number354() {
		Assert.assertEquals( "Success", "THREE HUNDRED FIFTY FOUR", numberWords.toWords( 354 ) ) ;
	}
	@Test
	public void number499() {
		Assert.assertEquals( "Success", "FOUR HUNDRED NINETY NINE", numberWords.toWords( 499 ) ) ;
	}
	@Test
	public void number711() {
		Assert.assertEquals( "Success", "SEVEN HUNDRED ELEVEN", numberWords.toWords( 711 ) ) ;
	}
	@Test
	public void number999() {
		Assert.assertEquals( "Success", "NINE HUNDRED NINETY NINE", numberWords.toWords( 999 ) ) ;
	}
	@Test
	public void numberThousand() {
		Assert.assertEquals( "ERROR", "Number out of range", numberWords.toWords( 1000 ) ) ;
	}

}
