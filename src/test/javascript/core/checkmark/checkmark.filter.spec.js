'use strict';

describe('checkmark', function() {

    beforeEach(module('core'));
    //beforeEach(module('/Users/Ludmila/IdeaProjects/PhoneApp/src/main/resources/static/core/checkmark/checkmark.filter.js'));
    //beforeEach(module('/Users/Ludmila/IdeaProjects/PhoneApp/src/main/resources/static/core/core.module.js'));

    it('should convert boolean values to unicode checkmark or cross',
        inject(function(checkmarkFilter) {
            expect(checkmarkFilter(true)).toBe('\u2713');
            expect(checkmarkFilter(false)).toBe('\u2718');
        })
    );

});
