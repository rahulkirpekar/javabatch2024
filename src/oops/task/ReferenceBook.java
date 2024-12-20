package oops.task;

public class ReferenceBook extends Book
{
	private String category;

	public ReferenceBook(String title, String author, String isbn, String category) 
	{
		super(title, author, isbn);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public void displayBookInfo() 
	{
		super.displayBookInfo();
		System.out.println(" Category: " + category);
	} 
}
