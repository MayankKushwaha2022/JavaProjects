/**
A question with a text and an answer.
*/
public class Question
{
private String text;
private String answer;
/**
Constructs a question with empty question and answer.
*/
public Question()
{
text = ""; 
answer = "";
}
/**
Sets the question text.
@param questionText the text of this question
*/
public void setText(String questionText)
{
text = questionText;
}
/**
2 A question with a text and an answer.
3 */
/**
Sets the answer for this question.
@param correctResponse the answer
*/
public void setAnswer(String correctResponse)
{// and more code…
	answer = correctResponse;
}
/**
* Checks a given response for correctness.
* @param response the response to check
* @return true if the response was correct, false otherwise
*/
	public boolean checkAnswer(String response)
	{
		return response.equals(answer);
	}
	/**
	* Displays this question.
	*/
		public void display()
		{
			System.out.println(text);
		}
}