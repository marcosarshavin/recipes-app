import { RecipesA2Page } from './app.po';

describe('recipes-a2 App', function() {
  let page: RecipesA2Page;

  beforeEach(() => {
    page = new RecipesA2Page();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
