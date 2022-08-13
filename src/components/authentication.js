class Auth {
    constructor() {
      this.authenticated = false;
    }
  
    login(user) {
      this.authenticated = true;
      user();
    }
  
    logout(user) {
      this.authenticated = false;
      user();
    }
  
    isAuthenticated() {
      return this.authenticated;
    }
  }
  
  export default new Auth();